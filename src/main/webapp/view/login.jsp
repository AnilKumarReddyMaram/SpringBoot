<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h2>Login Form</h2>
	<form:form method="POST" modelAttribute="login" action="req1">
    User Name:<form:input path="name" />
		<p></p>
    Password:<form:input path="password" />
		<p></p>
		<input type="submit" value="Login">
	</form:form>
</body>
</html>