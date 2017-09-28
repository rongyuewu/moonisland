<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html>  
<html>  
<head>  
<base href="<%=basePath%>">
<meta charset="UTF-8">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<title>员工列表</title>
</head>
<body>
	<table>
		<tr><td>品牌编号</td><td>品牌名称</td><td>LOGO</td><td>品牌描述</td><td>添加时间</td></tr>
		<c:forEach items="${brands}" var="bra">
			<tr>
				<td>${bra.brandId}</td>
				<td>${bra.brandName}</td>
				<td>${bra.brandLogo}</td>
				<td>${bra.brandCon}</td>
				<td>${bra.brandAddtime}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>