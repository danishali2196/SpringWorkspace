<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

     <h1 style="color: red;text-align: center;">Student Page</h1><br>
Welcome Mr <%=request.getUserPrincipal().getName()%><br><br>
Student Page :: <a href="faculty.jsp">Faculty</a>