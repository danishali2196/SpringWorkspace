<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Employee</title>
    <style>
        body{
            background-image: url("D:/IDE_WorkSpace_Spring/MVCProj7-RecordSearce/WebContent/WEB-INF/pages/cube.jpg");
            background-size: cover;
            color: orange;
            font-family: "Comic Sans MS",sans-serif;
            margin: 0;
        }
        h1{
            text-align: center;
        }
        h2{
            background-color: darkred;
            text-align: center;
            padding: 10px;
            box-shadow: 0 0 15px black;
        }
        input[type='text']{
            font-size: 18px;
            height: 35px;
            outline: orange;
            border: thin;
            border-radius: 10px;
        }
       
        input[type='text']:focus
       {
            background-color: #c6b484;
            box-shadow: 0 0 15px darkred;
        }
        table{
            width: 100%;
        }
        td{
            font-size: 18px;
            padding: 7px;
        }
        .button{
            background-color: darkred;
            color: orange;
            border: none;
            font-size: 18px;
            padding: 10px 55px;
            border-radius: 10px;
            outline: maroon;
        }
        a{
            color: orange;
        }
        </style>
</head>
<body>
<h1>Employee Result list</h1>

<br><br>
<c:choose>
    <c:when test="${!empty  searchResult}">

    
        <table>
        <tr bgcolor="red"> <th>empNo</th> <th>empName </th><th>job</th><th>salary</th> </tr>
              <c:forEach var="emp"  items="${searchResult}">
                  <tr bgcolor="cyan">
                     <td>${emp.empNo}</td>
                     <td>${emp.ename}</td>
                     <td>${emp.job}</td>
                     <td>${emp.sal}</td>
                  </tr>
             </c:forEach>
        </table>
         </c:when>
    <c:otherwise>
              <h1 style="color:red;text-align:center">Records not found </h1>
    </c:otherwise>
</c:choose>
<br><br>
   <a href="home.htm">home</a>    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 
    <a href="JavaScript:showPrint()"> print</a>
    
    <script language="JavaScript">
        function  showPrint(){
        	frames.focus();
        	frames.print();
        }
    </script>

</body>
</html>