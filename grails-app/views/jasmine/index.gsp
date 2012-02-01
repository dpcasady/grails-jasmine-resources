<!DOCTYPE html>
<html>
<head>
	<meta name="layout" content="jasmine-standalone">
	<title>Jasmine Spec Runner</title>
	<g:if test="${params.module}">
		<r:require module="${params.module}"/>
	</g:if>
</head>

<body>
	<g:if test="${!params.module}">
		<h1>Please, specify the module to be tested!</h1>
	</g:if>
</body>
</html>