<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
    <c:when test="${!empty empList }">
         <table border="1">
             <tr bgcolor="red"> <th>Id</th> <th>Name</th><th>Age</th><th>ODI Runs</th> <th>Test Runs</th><th>T20 Runs</th></tr>
             <c:forEach var="emp"  items="${empList}">
                  <tr bgcolor="cyan">
                     <td>${emp.id}</td>
                     <td>${emp.name}</td>
                     <td>${emp.age}</td>
                     <td>${emp.runsodi}</td>
                     <td>${emp.runstest}</td>
                     <td>${emp.runst20}</td>
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