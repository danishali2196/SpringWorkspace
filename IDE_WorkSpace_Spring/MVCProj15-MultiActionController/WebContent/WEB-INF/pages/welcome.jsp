<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

    
    <h1 style="color: maroon;text-align: center;">MULTI ACTION FORM</h1>
    <br><br>
    <form method="post" action="welcome.htm">
    	Student Number ::<input type="text" name="sno"><br>
    	Student Name ::<input type="text" name="sname"><br>
    	Student Addrs ::<input type="text" name="addrs"><br>
    	Mobile Number ::<input type="text" name="mobile"><br>
   <input type="submit" name="opt" value="insert"> 
   <input type="submit" name="opt" value="edit"> 
   <input type="submit" name="opt" value="delete"> 
   <input type="submit" name="opt" value="show"> 
    </form>
    
<%--     <c:if test="${!empty msg} "> --%>
    	<c:out value="${msg }"/>
<%--     </c:if> --%>