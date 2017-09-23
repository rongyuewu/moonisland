package cn.com.yld.utility;

import java.io.File;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.io.PrintWriter;  
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.ResultSetMetaData;  
import java.sql.SQLException;  
import java.sql.Statement;  
import java.util.Date; 

public class GenEntityMysql{
	private String packageOutPath = "com.yld.pojo";//指定实体生成所在包的路径  
	 private String authorName = "anmin";//作者名字  
	 private static String tablename;//表名  
	 private String classname = replaceUnderlineAndfirstToUpper(tablename.substring(tablename.indexOf("_")+1,tablename.length()),"_","");
	 private String[] colnames; // 列名数组  
	 private String[] colTypes; //列名类型数组  
	 private int[] colSizes; //列名大小数组  
	 private boolean f_util = false; // 是否需要导入包java.util.*  
	 private boolean f_sql = false; // 是否需要导入包java.sql.*  
	      
	    //数据库连接  
	  private static final String URL ="jdbc:mysql://localhost:3306/moon";  
	  private static final String NAME = "root";  
	  private static final String PASS = "123";  
	  private static final String DRIVER ="com.mysql.jdbc.Driver";  
	  
	 /*  
	  * 构造函数  
	  */  
	 public GenEntityMysql(){  
	     //创建连接  
	     Connection con;  
	  //查要生成实体类的表  
	     String sql = "select * from " + tablename;  
	     Statement pStemt = null;  
	     try {  
	      try {  
	    Class.forName(DRIVER);  
	   } catch (ClassNotFoundException e1) {  
	    // TODO Auto-generated catch block  
	    e1.printStackTrace();  
	   }  
	      con = DriverManager.getConnection(URL,NAME,PASS);  
	   pStemt = (Statement) con.createStatement();  
	   ResultSet rs = pStemt.executeQuery(sql);  
	   ResultSetMetaData rsmd = rs.getMetaData();  
	   int size = rsmd.getColumnCount(); //统计列  
	   colnames = new String[size];  
	   colTypes = new String[size];  
	   colSizes = new int[size];  
	   for (int i = 0; i < size; i++) {  
	    colnames[i] = rsmd.getColumnName(i + 1);  
	    colTypes[i] = rsmd.getColumnTypeName(i + 1);  
	      
	    if(colTypes[i].equalsIgnoreCase("date") || colTypes[i].equalsIgnoreCase("timestamp")){  
	     f_util = true;  
	    }  
	    if(colTypes[i].equalsIgnoreCase("blob") || colTypes[i].equalsIgnoreCase("char")){  
	     f_sql = true;  
	    }  
	    colSizes[i] = rsmd.getColumnDisplaySize(i + 1);  
	   }  
	     
	   String content = parse(colnames,colTypes,colSizes);  
	     
	   try {  
	    File directory = new File("");  
	    //System.out.println("绝对路径："+directory.getAbsolutePath());  
	    //System.out.println("相对路径："+directory.getCanonicalPath());  
	    String path=this.getClass().getResource("").getPath();  
	      
	    System.out.println(path);  
	    //System.out.println("src/?/"+path.substring(path.lastIndexOf("/com/", path.length())) );  
//	    String outputPath = directory.getAbsolutePath()+ "/src/"+path.substring(path.lastIndexOf("/com/", path.length()), path.length()) + initcap(tablename) + ".java";  
	    System.out.println("222222222222222222222222222222222222222222222222222222"+firstCharacterToUpper(classname));
	    String outputPath = directory.getAbsolutePath()+ "/src/"+this.packageOutPath.replace(".", "/")+"/"+firstCharacterToUpper(classname) + ".java"; 
	    System.out.println("33333333333333333333333333333333333"+outputPath);
	    FileWriter fw = new FileWriter(outputPath);  
	    PrintWriter pw = new PrintWriter(fw);  
	    pw.println(content);  
	    pw.flush();  
	    pw.close();  
	   } catch (IOException e) {  
	    e.printStackTrace();  
	   }  
	     
	  } catch (SQLException e) {  
	   e.printStackTrace();  
	  } finally{  
	//   try {  
//	    con.close();  
	//   } catch (SQLException e) {  
//	    // TODO Auto-generated catch block  
//	    e.printStackTrace();  
	//   }  
	  }  
	    }  
	  
	 /**  
	  * 功能：生成实体类主体代码  
	  * @param colnames  
	  * @param colTypes  
	  * @param colSizes  
	  * @return  
	  */  
	 private String parse(String[] colnames, String[] colTypes, int[] colSizes) {  
	  StringBuffer sb = new StringBuffer();  
	    
	  sb.append("package " + this.packageOutPath + ";\r\n");  
	  //判断是否导入工具包  
	  if(f_util){  
	   sb.append("import java.util.Date;\r\n");  
	  }  
	  if(f_sql){  
	   sb.append("import java.sql.*;\r\n");  
	  }  
	  sb.append("\r\n");  
	  //注释部分  
	  sb.append("   /**\r\n");  
	  sb.append("    * "+firstCharacterToUpper(classname)+" 实体类\r\n");  
	  sb.append("    * "+new Date()+" "+this.authorName+"\r\n");  
	  sb.append("    */ \r\n");  
	  //实体部分  
	  sb.append("\r\n\r\npublic class " + firstCharacterToUpper(classname) + "{\r\n");  
	  processAllAttrs(sb);//属性  
	  processAllMethod(sb);//get set方法  
	  sb.append("}\r\n");  
	    
	     //System.out.println("999999 = " +sb.toString());  
	  return sb.toString();  
	 }  
	   
	 /**  
	  * 功能：生成所有属性  
	  * @param sb  
	  */  
	 private void processAllAttrs(StringBuffer sb) {  
	    
	  for (int i = 0; i < colnames.length; i++) {  
	   sb.append("\tprivate " + sqlType2JavaType(colTypes[i]) + " " + defineVar(colnames[i]) + ";\r\n");  
	  }  
	    
	 }  
	  
	 /**  
	  * 功能：生成所有方法  
	  * @param sb  
	  */  
	 private void processAllMethod(StringBuffer sb) {  
	    
	  for (int i = 0; i < colnames.length; i++) {  
	   sb.append("\n\tpublic void set" + transVar(colnames[i]) + "(" + sqlType2JavaType(colTypes[i]) + " " +  
	     defineVar(colnames[i]) + "){\r\n");  
	   sb.append("\t\tthis." + this.defineVar(colnames[i]) + "=" + this.defineVar(colnames[i]) + ";\r\n");  
	   sb.append("\t}\r\n");  
	   sb.append("\n\tpublic " + sqlType2JavaType(colTypes[i]) + " get" + transVar(colnames[i]) + "(){\r\n");  
	   sb.append("\t\treturn " + defineVar(colnames[i]) + ";\r\n");  
	   sb.append("\t}\r\n");  
	  }  
	    
	 }  
	   
	 /**  
	  * 功能：将输入字符串的首字母改成大写  
	  * @param str  
	  * @return  
	  */  
	 private  String initcap(String str) {  
	    
	  char[] ch = str.toLowerCase().toCharArray();  
	    
	  if(ch[0] >= 'a' && ch[0] <= 'z'){  
	   ch[0] = (char)(ch[0] - 32);  
	  }  
	  
	  return new String(ch);  
	 }  
	 
	 
	 /**
	  * 替换下划线并让下一个字母大写
	  * @param srcStr
	  * @param org
	  * @param ob
	  * @return
	  */
	 public static String replaceUnderlineAndfirstToUpper(String srcStr,String org,String ob)  
	 {  
	    String newString = "";  
	    int first=0;  
	    while(srcStr.indexOf(org)!=-1)  
	    {  
	     first=srcStr.indexOf(org);  
	     if(first!=srcStr.length())  
	     {  
	      newString=newString+srcStr.substring(0,first)+ob;  
	      srcStr=srcStr.substring(first+org.length(),srcStr.length());  
	      srcStr=firstCharacterToUpper(srcStr);  
	     }  
	    }  
	    newString=newString+srcStr; 
	    return newString;  
	 }  
	   
	 private static String firstCharacterToUpper(String srcStr) {
		 System.out.println("=================================================================================="+srcStr);
		 System.out.println("--------------------------------------"+srcStr.substring(0, 1).toUpperCase() + srcStr.substring(1));
		 return srcStr.substring(0, 1).toUpperCase() + srcStr.substring(1);
	}

	/**  
	  * 用于生成get/set方法时  
	  * 功能：先将变量字母全变为小写，将第一个字母变为大写，将紧跟“_”后面一个字母大写，并去掉“_”.  
	  * @param str  
	  * @return  
	  */  
	 private String transVar(String str){  
	  System.out.println("111"+str);  
	  int index = 0;  
	  if(str.indexOf("_")!=-1){  
	   index = str.indexOf("_");  
	   str = str.replace("_", "");  
	  }  
	  System.out.println("222"+str);  
	  char[] ch = str.toLowerCase().toCharArray();  
	  if(ch[0] >= 'a' && ch[0] <= 'z'){  
	   ch[0] = (char)(ch[0] - 32);  
	   if(index!=0){  
	    ch[index] = (char)(ch[index] - 32);  
	   }  
	  }  
	  str =  new String(ch);  
	  System.out.println("333"+str);  
	  return str;  
	 }  
	   
	 /**  
	  * 用于定义变量名  
	  * 功能：先将变量字母全变为小写，将紧跟“_”后面一个字母大写，并去掉“_”.  
	  * @param str  
	  * @return  
	  */  
	 private String defineVar(String str){  
	  int index = 0;  
	  if(str.indexOf("_")!=-1){  
	   index = str.indexOf("_");  
	   str = str.replace("_", "");  
	  }  
	  char[] ch = str.toLowerCase().toCharArray();  
	  if(ch[0] >= 'a' && ch[0] <= 'z'&&index!=0){  
	   ch[index] = (char)(ch[index] - 32);  
	  }  
	  str =  new String(ch);  
	  return str;  
	 }  
	  
	 /**  
	  * 功能：获得列的数据类型  
	  * @param sqlType  
	  * @return  
	  */  
	 private String sqlType2JavaType(String sqlType) {  
	    
	  if(sqlType.equalsIgnoreCase("binary_double")){  
	   return "double";  
	  }else if(sqlType.equalsIgnoreCase("binary_float")){  
	   return "float";  
	  }else if(sqlType.equalsIgnoreCase("blob")){  
	   return "byte[]";  
	  }else if(sqlType.equalsIgnoreCase("blob")){  
	   return "byte[]";  
	  }else if(sqlType.equalsIgnoreCase("char") || sqlType.equalsIgnoreCase("nvarchar2")  
	    || sqlType.equalsIgnoreCase("varchar2")){  
	   return "String";  
	  }else if(sqlType.equalsIgnoreCase("date") || sqlType.equalsIgnoreCase("timestamp")  
	     || sqlType.equalsIgnoreCase("timestamp with local time zone")   
	     || sqlType.equalsIgnoreCase("timestamp with time zone")){  
	   return "Date";  
	  }else if(sqlType.equalsIgnoreCase("number")){  
	   return "Long";  
	  } else if(sqlType.equalsIgnoreCase("int")){  
		   return "int";  
	}  
	    
	  return "String";  
	 }  
	   
	 /**  
	  * 出口  
	  * TODO  
	  * @param args  
	  */  
	 public static void main(String[] args) {  
		 
		 	String[] strArray={"moon_about","moon_address","moon_admin","moon_area","moon_brand","moon_cart","moon_glass","moon_goods"
		 			,"moon_goods_attr","moon_goods_comment","moon_goods_pic","moon_optometry","moon_order","moon_photo_wall","moon_returnorder","moon_save"
		 			,"moon_user"};
		   //输出java数组
		   for(int i=0;i<strArray.length;i++)
		   {
			   tablename=strArray[i];
			   new GenEntityMysql();
		   }
		     
	    
	 }  
}
