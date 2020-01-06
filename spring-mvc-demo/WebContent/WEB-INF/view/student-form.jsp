<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" />
		<br><br>
		Last Name: <form:input path="lastName" />
		<br><br>
		Country:
			<form:select path="country">
	<!--<form:option value="America" label="America" />
	<form:option value="Brazil" label="Brazil" />
	<form:option value="India" label="India" />
	<form:option value="Canada" label="Canada" /> -->
			<form:options items="${student.countryOptions}" />
			</form:select>	
	<br><br>
		Favorite Language: 
		<!--  Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		JavaScript <form:radiobutton path="favoriteLanguage" value="JavaScript"/>
		HTML <form:radiobutton path="favoriteLanguage" value="HTML"/> -->
		<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
	<br><br>
		<form:checkboxes items="${student.operatingSystemOptions}" path="operatingSystem"/>
	<input type="submit" value="Submit" />
	</form:form>	
</body>
</html>