<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Employee</title>
<style>
body {
    text-align: center;
    background-color: pink;
}
table, th, td {
    margin: auto;
    border: 2px solid black;
}
</style>
</head>
<body>

<form:form modelAttribute="emp" action="updateEmployee" method="post">
    <table>
        <tr>
            <td><form:hidden path="id"/></td>
        </tr>
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
    </table>
</form:form>
</body>
</html>
