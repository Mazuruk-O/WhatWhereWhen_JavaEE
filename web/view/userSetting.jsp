<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <jsp:include page="headerYESAuthorization.jsp"/>

    <div>
        <p>Language: ${user.language}</p>
    </div>

    <jsp:include page="footer.jsp" />

</body>
</html>
