<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:include page="headerYESAuthorization.jsp"/>

<div>
    <p>Firstname: ${user.firstname}</p>
    <p>Lastname: ${user.lastname}</p>
    <p>Surnamename: ${user.surname}</p>
    <p>Date birthday: ${user.dateBirthday}</p>
    <p>Language: ${user.language}</p>
</div>

<jsp:include page="footer.jsp" />

</body>
</html>
