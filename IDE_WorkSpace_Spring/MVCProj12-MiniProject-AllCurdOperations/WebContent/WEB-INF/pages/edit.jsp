
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CricketerRegistration</title>
  
 </head> 
<body>
<h1>CRICKETER MODIFICATION FORM</h1>

    <form:form method="post"  commandName="editcmd" onclick="onSubmit">
        <table>
        	<tr>
                <td>Cricketer ID::</td>
                <td>
                    <form:input path="id" readonly="true"/><form:errors path="id" ></form:errors>
                </td>
            </tr>
            <tr>
                <td>Cricketer Name::</td>
                <td>
                    <form:input path="name"/>
                </td>
            </tr>
            <tr>
                <td>Cricketer Age::</td>
                <td>
                    <form:input path="age"/>
                </td>
            </tr>
            <tr>
                <td>ODI Runs::</td>
                <td>
                    <form:input path="runsodi"/>
                </td>
           </tr>
            <tr>
                <td>Test Runs::</td>
                <td>
					<form:input path="runstest"/>
                </td>
            </tr>
            <tr>
                <td>T20 Runs::</td>
                <td>
					<form:input path="runst20"/>
                </td>
            </tr>
            <tr>
   				
   				<td>
                    <input type="submit" value="update" >  
                </td>
            </tr>


        </table>

    </form:form>


</body>
</html>