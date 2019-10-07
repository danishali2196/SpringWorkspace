<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form method="post" modelAttribute="uplCmd" enctype="multipart/form-data">
	<input type="file" name="file1"><br>
	<input type="file" name="file2"><br>
	<input type="submit" value="upload">

</form:form>

<br><br><br>
${file1}
${file2}
