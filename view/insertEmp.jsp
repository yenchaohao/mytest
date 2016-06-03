<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="BIG5"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page import="com.emp.model.*" %>
<% EmpVO empVO = (EmpVO) request.getAttribute("empVO"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>
<body>
	<form action="/view/EmpServlet.do" method="post" name="isertEmp">
		<input type="text" name="ename" value="${empVO.ename}" id="ename" >
		<br>
		<input type="text" name="euser" value="${empVO.euser}" id="euser">
		<br>
		<input type="password" name="password" value="" id="password">
		<input type="email" name="email" id="email">
		<input type="submit" value="送出">
		<input type="hidden" name="action" value="insertEmp">
	</form>
</body>
</html>