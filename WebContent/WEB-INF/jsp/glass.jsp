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
<style type="text/css">
	td{
		width: 100px;
		text-align: center;
	}
</style>
</head>
<body>
	<table>
		<tr>
			<td>镜片编号</td>
			<td>镜片类型</td>
			<td>镜片名称</td>
			<td>镜片价格</td>
			<td>球镜价格</td>
			<td>柱镜价格</td>
			<td>镜片图片</td>
			<td>图片缩小</td>
			<td>镜片添加时间</td>
			<td>颜色1</td>
			<td>颜色2</td>
			<td>颜色3</td>
			<td>颜色4</td>
			<td>颜色5</td>
			<td>颜色6</td>
			<td>颜色7</td>
			<td>颜色8</td>
			<td>颜色9</td>
			<td>是否选中</td>
			<td colspan="2">操作</td>
		</tr>
		<c:forEach items="${glasss}" var="gla">
			<tr>
				<td>${gla.glassId}</td>
				<td>${gla.glassStyle}</td>
				<td>${gla.glassName}</td>
				<td>${gla.glassPrice}</td>
				<td>${gla.sphPrice}</td>
				<td>${gla.cylPrice}</td>
				<td>${gla.glassImg}</td>
				<td>${gla.glassImgthumb}</td>
				<td>${gla.glassTime}</td>
				<td>${gla.color1}</td>
				<td>${gla.color2}</td>
				<td>${gla.color3}</td>
				<td>${gla.color4}</td>
				<td>${gla.color5}</td>
				<td>${gla.color6}</td>
				<td>${gla.color7}</td>
				<td>${gla.color8}</td>
				<td>${gla.color9}</td>
				<td><input type="checkbox"></td>
				<td>更新</td>
				<td>删除</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>