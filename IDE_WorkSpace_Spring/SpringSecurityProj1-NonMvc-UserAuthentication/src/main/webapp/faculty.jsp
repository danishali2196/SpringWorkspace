<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

 <h1 style="color: red;text-align: center;">Faculty Page</h1><br>
Welcome Mr <%=request.getUserPrincipal().getName()%><br><br>
Student Page :: <a href="student.jsp">Student</a>