<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Profile</title>
</head>
<body>

ACCOUNT DETAILS:<BR>
User name:${userDetails.username}<br>
User last login:${userDetails.lastLogin}<br>
User role id :${userDetails.roleId}<br>
User created on:${userDetails.createdDate}<br>
User created by:${userDetails.createdBy}<br>

User last login:${userDetails.password}<br>

PERSONAL DETAILS:<BR>

${personalProfile.firstName}<BR>
${personalProfile.middleName}<BR>
${personalProfile.surname}<BR>
${personalProfile.fatherName}<BR>
${personalProfile.motherName}<BR>
${personalProfile.gender}<BR>
${personalProfile.dob}<BR>
${personalProfile.correspondenceAddress}<BR>
${personalProfile.permanentAddress}<BR>
${personalProfile.telephoneNo}<BR>
${personalProfile.mobileNo}<BR>
${personalProfile.emailId}<BR>
${personalProfile.category}<BR>
${personalProfile.aadharNo}<BR>

<form action="edit" method="get">
<input hidden type="text" name="id" value="${personalProfile.username}"/>
<input type="submit" value="Edit"/>
</form>


PROFESSIONAL DETAILS:<BR>

${professionalProfile.branch}<BR>
${professionalProfile.year}<BR>
${professionalProfile.status}<BR>
${professionalProfile.jobCategory}<BR>
${professionalProfile.fieldOfInterest}<BR>
${professionalProfile.qualificationId}<BR>
${professionalProfile.achievements}<BR>
${professionalProfile.projects}<BR>
${professionalProfile.internships}<BR>
${professionalProfile.coCurricularActivities}<BR>
${professionalProfile.extraCurricularActivities}<BR>
${professionalProfile.jobId}<BR>


<form action="edit" method="get">
<input hidden type="text" name="id" value="${professionalProfile.username}"/>
<input type="submit" value="Edit"/>
</form>

</body>
</html>