<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
	<title>
		Student Registration form
	</title>
</head>

<body>

	<form:form action ="processForm" modelAttribute="student">
		First Name: <form:input path="firstName" />
		<br><br>
		Last Name: <form:input path="lastName" />
		<br><br>
		
		Country: 
		<!--<form:select path="country" >
		<form:options items= "${student.countryOptions}"/>
		</form:select> -->
		
		<form:select path="country"> 
			<form:options items="${theCountryOptions}" />
		</form:select>
		
		<br><br>
		
		<form:radiobuttons path="favoriteLanguage" items = "${student.favoriteLanguageOptions}"/>
		<!--  Java:<form:radiobutton path="favoriteLanguage" value="Java"/>
		C#:<form:radiobutton path="favoriteLanguage" value="C#"/>
		PHP:<form:radiobutton path="favoriteLanguage" value="PHP"/>
		Ruby:<form:radiobutton path="favoriteLanguage" value="Ruby"/>-->
		<br><br>
		Operating Systems:
		Linux:<form:checkbox path = "operatingSystems" value="Linux"/>
		Windows:<form:checkbox path = "operatingSystems" value="Windows"/>
		Mac:<form:checkbox path = "operatingSystems" value="Mac"/>
		<br><br>
		<input type= "submit" value="Submit"/>
	
	</form:form>
</body>

</html>
