<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="headerYESAuthorization.jsp"/>

    <div>
        <p>Tourney name: ${resultTourney.tourney.name}</p>
        <p>Number Team: ${resultTourney.team.name}</p>
        <p>Number right answer: ${resultTourney.numberRightAnswer}</p>
    </div>

    <jsp:include page="footer.jsp" />
</body>
</html>
