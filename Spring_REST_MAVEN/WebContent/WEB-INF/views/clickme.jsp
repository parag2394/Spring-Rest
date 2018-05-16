<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="su" uri="http://www.springframework.org/tags" %>
<su:url value="/" var="index"/>
<html>
<head>
    <title>Click Me</title>
</head>
<body>
<h1>${hello2}</h1>
<a href="${index}">Home</a>
</body>
</html>
