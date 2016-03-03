<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list user</title>
</head>
<body>
<c:forEach items="${user}" var="item">
    ${item.id}--${item.name}
    <br>
</c:forEach>
</body>
</html>
