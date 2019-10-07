<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
    <c:when test="${!empty userList }">
         <table border="1">
             <tr bgcolor="red"><th>Id</th> <th>Adhar Id</th><th>Name</th><th>dob</th> <th>gender</th><th>addrs</th><th>mobile</th></tr>
             <c:forEach var="user"  items="${userList}">
                  <tr bgcolor="cyan">
                     <td>${user.adharid}</td>
                     <td>${user.name}</td>
                     <td>${user.dob}</td>
                     <td>${user.gender}</td>
                     <td>${user.addrs}</td>
                     <td>${user.mobile}</td>
                  </tr>
             </c:forEach>
         </table>
    </c:when>
    <c:otherwise>
              <h1 style="color:red;text-align:center">Records not found </h1>
    </c:otherwise>
</c:choose>

 <br><br>
   <a href="index.jsp">home</a>    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; 
    <a href="JavaScript:showPrint()"> print</a>
    
    <script language="JavaScript">
        function  showPrint(){
        	frames.focus();
        	frames.print();
        }
    </script>
   