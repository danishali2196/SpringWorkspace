<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
            outline: none;
        }
        a{
            color: orange;
        }
        </style>
</head>
<body>
<h1>Employee Search  Danish</h1>

    <form  action="search.htm" method="post">
        <table>
            <tr>
                <td></td>
                <td>Employee ID::</td>
                <td>
                    <input type="text"  name="empNo">
                </td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td>Employee Name::</td>
                <td>
                    <input type="text" name="ename">
                </td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td>Job::</td>
                <td>
                    <input type="text" name="job">
                </td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td>Salary::</td>
                <td>
                    <input type="text" name="sal">
                </td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td>
                    <input type="submit" value="searce">
                </td>
            </tr>


        </table>

    </form>


</body>
</html>