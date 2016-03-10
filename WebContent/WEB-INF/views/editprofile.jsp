<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Profile</title>
</head>
<body>
FORM 1
<form action="update-profile.html" method="post">
	
	Name:<input name="name" type="text" value="${result.name}"/><br>
	Id:<input name="id" type="text" value="${result.id}"/><br>
	
	<input type="submit" value="update"/>

</form>

<form action="update-personal.html" method="post">
	
PERSONAL DETAILS:<BR>

<input hidden name="username" type="text" value="${personalProfile.username}"/><br>
<input name="firstName" type="text" value="${personalProfile.firstName}"/><br>
<input name="middleName" type="text" value="${personalProfile.middleName}"/><br>
<input name="surname" type="text" value="${personalProfile.surname}"/><br>
<input name="fatherName" type="text" value="${personalProfile.fatherName}"/><br>
<input name="motherName" type="text" value="${personalProfile.motherName}"/><br>
<input name="gender" type="text" value="${personalProfile.gender}"/><br>
<input name="dob" type="text" value="${personalProfile.dob}"/><br>
<input name="correspondenceAddress" type="text" value="${personalProfile.correspondenceAddress}"/><br>
<input name="permanentAddress" type="text" value="${personalProfile.permanentAddress}"/><br>
<input name="telephoneNo" type="text" value="${personalProfile.telephoneNo}"/><br>
<input name="mobileNo" type="text" value="${personalProfile.mobileNo}"/><br>
<input name="emailId" type="text" value="${personalProfile.emailId}"/><br>
<input name="category" type="text" value="${personalProfile.category}"/><br>
<input name="aadharNo" type="text" value="${personalProfile.aadharNo}"/><br>

	<input type="submit" value="update"/>

</form>



<form action="update-professional.html" method="post">
	
PROFESSIONAL DETAILS:<BR>

<input hidden name="username" type="text" value="${professionalProfile.username}"/><br>
<input name="branch" type="text" value="${professionalProfile.branch}"/><br>
<input name="year" type="text" value="${professionalProfile.year}"/><br>
<input name="status" type="text" value="${professionalProfile.status}"/><br>
<input name="jobCategory" type="text" value="${professionalProfile.jobCategory}"/><br>
<input name="fieldOfInterest" type="text" value="${professionalProfile.fieldOfInterest}"/><br>
<input name="qualificationId" type="text" value="${professionalProfile.qualificationId}"/><br>
<input name="achievements" type="text" value="${professionalProfile.achievements}"/><br>
<input name="projects" type="text" value="${professionalProfile.projects}"/><br>
<input name="internships" type="text" value="${professionalProfile.internships}"/><br>
<input name="coCurricularActivities" type="text" value="${professionalProfile.coCurricularActivities}"/><br>
<input name="extraCurricularActivities" type="text" value="${professionalProfile.extraCurricularActivities}"/><br>
<input name="jobId" type="text" value="${professionalProfile.jobId}"/><br>


	<input type="submit" value="Update"/>

</form>

</body>
</html>