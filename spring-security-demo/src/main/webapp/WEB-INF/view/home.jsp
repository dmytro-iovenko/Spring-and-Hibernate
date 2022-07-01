<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<html>

	<head>
		<title>Example Company Home Page</title>
	</head>
	
	<body>

		<h2>Example Company Home Page</h2>

		<hr/>

		Welcome to the example company home page!

		<hr/>
		
		<!-- display user name and role -->
		
		<p>
			User: <security:authentication property="principal.username" />
			<br/><br/>
			Role(s): <security:authentication property="principal.authorities" />
		</p>
		
		<hr/>

		<!-- Add a logout button -->

		<form:form action="${pageContext.request.contextPath}/logout" 
				   method="POST">
		
			<input type="submit" value="Logout" />
		
		</form:form>

	</body>

</html>