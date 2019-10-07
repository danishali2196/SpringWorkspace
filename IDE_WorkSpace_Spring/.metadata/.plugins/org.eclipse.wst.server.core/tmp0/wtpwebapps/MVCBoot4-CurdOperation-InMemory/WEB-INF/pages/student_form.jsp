<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form method="post" modelAttribute="studCmd">
	Student ID :: <form:input path="sid"/><br>
	Student Name :: <form:input path="name"/><br>
	Student Addrs :: <form:input path="addrs"/><br>
	<input type="submit" value="submit">
</form:form>

<br><br>
Display Student :: <a href="display.htm">Display Student</a>
<br><br>
result :: ${msg}
<br><br>
student :: ${display}