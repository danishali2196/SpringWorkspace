<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<form:form method="POST" commandName="regCmd">
<form:errors path="*"/>
	<table>
		<tr>
			<td>Student Name</td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td>Student Addrs</td>
			<td><form:input path="addrs"/></td>
		</tr>
		<tr>
			<td>Date Of Birth</td>
			<td><form:input path="dob" />(dd-MM-yyyy)</td>
		</tr>
		
		<tr>
			<td>Date Of Joining</td>
			<td><form:input path="doj" />(dd-MM-yyyy)</td>
		</tr>
		<tr><td><input type="submit" value="register"></td></tr>
	</table>






</form:form>