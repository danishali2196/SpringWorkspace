
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CricketerRegistration</title>
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
            border: medium;
            border-color:black;
   
            border-radius: 10px;
        }
        
       
        input[type='text']:focus 
        { 
           background-color: gray; 
            border-color: blue; 
            
           box-shadow: 0 0 15px darkred; 
             border: 15px; 
       } 
       
        table{
            width: 100%;
            align-self: center;
        }
        td{
            font-size: 18px;
            padding: 7px;
            align-content: center;
        }
        .button{
            background-color: darkred;
            color: orange;
            border: none;
            font-size: 18px;
            padding: 10px 55px;
            border-radius: 10px;
            outline: none;
        }
        a{
            color: orange;
        }
        </style>
</head>
<body>
<h1>CRICKETER REGISTRATION</h1>

    <form:form  method="post" commandName="criccmd" >
        <table>
        	<tr>
                <td>Cricketer ID::</td>
                <td>
                    <form:input path="id"/>
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
                    <input type="submit" value="Register">
                </td>
            </tr>


        </table>

    </form:form>


</body>
</html>