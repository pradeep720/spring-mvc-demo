<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
<title> student Registration form </title>

</head>
<body>
<form:form action="processForm" modelAttribute="student">

	First name: <form:input path="firstName"/>
	
	<br><br>
	
	Last name: <form:input path="secondName"/>
	
	<br><br>
	
	Country :
	<form:select path="country">
	<form:options items="${student.countryOptions}" />
	
	</form:select>
	<br><br>
	
	Favorite Language:
	Java<form:radiobutton path="favoriteLanguage" value="Java"/>
	.net<form:radiobutton path="favoriteLanguage" value=".net"/>
	Devops<form:radiobutton path="favoriteLanguage" value="devops"/>
	Angular<form:radiobutton path="favoriteLanguage" value="Angular"/>
	
	
	<br><br>
	
	Operating Systems:
     Linux <form:checkbox  path="operatingSystems" value="Linux"/>
      Windows  <form:checkbox  path="operatingSystems" value="windows"/>
	 Macos<form:checkbox  path="operatingSystems" value="Mac os"/>
	<br><br>
	
	<input type="submit" value="submit"/>

</form:form>

</body>
</html>