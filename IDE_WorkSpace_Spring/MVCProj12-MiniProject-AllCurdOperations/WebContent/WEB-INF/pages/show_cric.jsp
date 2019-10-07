<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
    <c:when test="${!empty cricList }">
         <table border="1">
             <tr bgcolor="red"><th>Id</th> <th>Name</th><th>Age</th><th>ODI Runs</th> <th>Test Runs</th><th>T20 Runs</th><th>Edit/Delete</th></tr>
             <c:forEach var="cric"  items="${cricList}">
                  <tr bgcolor="cyan">
                     <td>${cric.id}</td>
                     <td>${cric.name}</td>
                     <td>${cric.age}</td>
                     <td>${cric.runsodi}</td>
                     <td>${cric.runstest}</td>
                     <td>${cric.runst20}</td>
                     <td><a href="edit.htm?id=${cric.id}">Edit</a>&nbsp;/&nbsp;<a href="delete.htm?id=${cric.id }">Delete</a></td>
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