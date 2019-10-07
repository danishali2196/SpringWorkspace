<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<%-- <form:form method="post" commandName="studCmd">
	Student NO:::<form:input path="sno"/>
	Student Name::<form:input path="sname"/>
	Student DOB::<form:input path="dob"/> 
 	Student DOJ::<form:input path="doj"/> 
	
<!-- 	<input type="submit" value="Register"/> -->

 </form:form> --%>
 
 <form method="post" action="result.htm">
 	<input type="text" name="sno">
 	<input type="text" name="sname">
 	<input type="text" name="dob">
 	<input type="text" name="doj">
 	<input type="submit" value="submit">
 </form>