<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

    
    <h1 style="color: red;text-align: center;">Adhar Registration Form</h1>

    <form:form method="POST" modelAttribute="userCmd" >
    	Name :: <form:input path="name"/><br>
    	DOB   :: <form:input path="dob"/><br>
<%--     	Gender :: <form:radiobuttons path="gender"> --%>
<%--     								<form:options> --%>
<%--     									<form:option value="male">male</form:option> --%>
<%--     									<form:option value="female">female</form:option> --%>
<%--     								</form:options> --%>
<%--     						</form:radiobuttons><br> --%>
Gender :: <form:input path="gender"/><br>
    	Address :: <form:input path="addrs"/><br>
    	Mobile ::<form:input path="mobile"/><br>					
    
    <input type="submit" value="register"/>
    
    </form:form>
    