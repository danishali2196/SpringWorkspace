<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    
    <c:choose >
    	<c:when test="${!empty listDTO}">
			<table>
					<tr>
						<th>id</th><th>name</th><th>age</th><th>odi</th><th>test</th><th>t20</th>
					</tr>			
					  <c:forEach var="cric"  items="${listDTO}">
                  <tr bgcolor="cyan">
                     <td>${cric.id}</td>
                     <td>${cric.name}</td>
                     <td>${cric.age}</td>
                     <td>${cric.runsodi}</td>
                     <td>${cric.runstest}</td>
                     <td>${cric.runst20}</td>
                  </tr>
             </c:forEach>
			</table>    	
    	
    	</c:when>

    
    <c:otherwise>
              <h1 style="color:red;text-align:center">Records not found </h1>
    </c:otherwise>
</c:choose>

 <br><br>
   <a href="home.htm">home</a> 
    