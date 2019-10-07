<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>    
    
    <form:form method="POST" commandName="metCmd">
    Expected Age :: <form:input path="expAge"/><br>
    Hobies :: <form:checkboxes path="expHobies" items="${hobiesList}"/><br>
    <input type="submit" value="Pre"  name="_target1">&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="Register"  name="_finish">&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="Cancel"  name="_cancel">
  
    </form:form>
