<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<table border="2">
<form:form action="addEmployee" modelAttribute="emp" method="get"> 
<tr>
	<td>Employee Name</td>
    <td><form:input path="employeeName"/></td>
</tr>
<tr>
	<td>Employee Address</td>
    <td><form:input path="employeeAddress"/></td>
</tr>
<tr>
	<td>Employee Phone</td>
    <td><form:input path="employeePhone" /></td>
</tr>
<tr>
	<td>Employee Salary</td>
    <td><form:input path="employeeSalary"/></td>
</tr>
<tr>
<td><input type="submit" value="Save.."/></td>
<td><input type="reset" value="ReSet.."/></td>
</tr>
</form:form>
</table>
</body>
</html>