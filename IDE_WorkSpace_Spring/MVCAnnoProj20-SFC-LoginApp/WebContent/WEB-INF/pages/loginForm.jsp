<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
    
    <h1 style="color: red;text-align: center;">User Login Form</h1>
   
   <form:form method="POST" modelAttribute="userCmd" >
    username ::	<form:input path="username"/>
   <br>
   password :: <form:input path="password"/>
   <br>
   <input type="submit" value="login"/><br>
   </form:form>
   
   result::: ${resultMsg}