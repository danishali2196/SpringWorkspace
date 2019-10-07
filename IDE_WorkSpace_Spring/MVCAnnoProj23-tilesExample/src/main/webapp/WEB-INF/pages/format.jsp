<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
    
    <html>
    	<head>
    		<title><tiles:insertAttribute name="title" ignore="true"/></title>
    	</head>
    	
    	<body>
    		<table width="100%" height="100%" >
    			<tr height="20%">
    				<td colspan="2"><tiles:insertAttribute name="header"/>
    			</tr>
    			
    			<tr height="70%">
    				<td width="30%"><tiles:insertAttribute name="menu"/></td>
    				<td width="70%"><tiles:insertAttribute name="body"/></td>
    			</tr>
    			
    			<tr height="10%">
    				<td><tiles:insertAttribute name="footer" /></td>
    			</tr>
    		</table>
    	
    	</body>
    
    </html>