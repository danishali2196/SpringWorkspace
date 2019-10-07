
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CustomerRegistration</title>
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
<h1>CUSTOMER REGISTRATION</h1>

    <form:form  method="post" commandName="custcmd" >
        <table>
            <tr>
                <td>Customer Name::</td>
                <td>
                    <form:input path="cname"/>
                </td>
            </tr>
            <tr>
                <td>Customer Address::</td>
                <td>
                    <form:input path="caddrs"/>
                </td>
            </tr>
            <tr>
                <td>Mobile No::</td>
                <td>
                    <form:input path="mobileNo"/>
                </td>
           </tr>
            <tr>
                <td>Bill Amount::</td>
                <td>
					<form:input path="billAmt"/>
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