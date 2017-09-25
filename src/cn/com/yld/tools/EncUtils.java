package cn.com.yld.tools;
import java.security.MessageDigest;
public class EncUtils {
	/*
	MD5即Message-Digest Algorithm 5（信息-摘要算法5），是一种杂凑算法，
	能将任意字符串运算成固定长度（128位二进制）的字符串
MD5是不可逆的，也就是没有对应的算法，从生产的MD5值逆向得到原始数据。
一个原始数据只对应一个md5值，但是一个MD5值，可能对应多个原始数据。
Java实现MD5可用系统库自带的MessageDigest类，例子如下
	 * */
	public static void main(String[] args) {
		System.out.println(str2MD5("hello").length());
	}
	 //生成MD5  
    public static String str2MD5(String message) {  
        String md5 = "";  
        try {  
            MessageDigest md = MessageDigest.getInstance("MD5");// 创建一个md5算法对象  
            byte[] messageByte = message.getBytes("UTF-8");//将字符串转化为字节数组，按照utf-8编码  
            byte[] md5Byte = md.digest(messageByte);// 获得MD5字节数组,16*8=128位，即加密后结果  
            md5 = bytesToHex(md5Byte);// 转换为16进制字符串 ，因为加密后是字节信息不方便使用转化为字符串 
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return md5;  
    }  
     // 二进制转十六进制  
    public static String bytesToHex(byte[] bytes) {  
        StringBuffer hexStr = new StringBuffer();  
        int num;  
        for (int i = 0; i < bytes.length; i++) {  
            num = bytes[i];  
             if(num < 0) {  
                 num += 256;  
            }  
            if(num < 16){  
                hexStr.append("0");  
            }  
            hexStr.append(Integer.toHexString(num));  
        }  
        return hexStr.toString().toLowerCase();  
    }  
}  
