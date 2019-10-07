<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form method="post" commandName="formCmd">
	<table>
		<tr>
			<th>Name	</th>
			<th><form:input path="name"/></th>
		</tr>
		<tr>
			<th>Addrs	</th>
			<th><form:input path="addrs"/></th>
		</tr>
		<tr>
			<th>Country	</th>
			<th><form:select path="country" >
					<form:options items="${country}"/>
			</form:select></th>
			
		</tr>
		<tr>
			<th>Gender	</th>
			<th><form:radiobuttons path="gender" items="${gender}"/></th>
		</tr>
		<tr>
			<th>Hobies	</th>
			<th><form:checkboxes items="${hobbieList}" path="hobies"/></th>
		</tr>
		<tr>
			<th>Products	</th>
			<th><form:select path="product" multiple="multiple">
					<form:options items="${prodList}"/>
			</form:select></th>
		</tr>
		<tr><th><input type="submit" value="submit"></th></tr>
	</table>
</form:form>
    
    