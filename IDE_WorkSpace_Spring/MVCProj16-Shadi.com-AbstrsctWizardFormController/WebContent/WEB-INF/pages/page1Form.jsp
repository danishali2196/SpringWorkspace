<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>    
    
    <form:form method="POST" commandName="metCmd">
    Name :: <form:input path="name"/><br>
    Address :: <form:input path="addrs"/><br>
    Date of Birth :: <form:input path="dob"/><br>
    Gender :: <form:radiobuttons path="gender" items="${genderList }"/><br>
    <input type="submit" value="Next"  name="_target1">&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="Cancel"  name="_cancel">
    
    
    	
    </form:form>
