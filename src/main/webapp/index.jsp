<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Countries loaded from properties.</title>
</head>
<body>
Countries:
<br/>
<select name="country">
    <c:forEach items="${properties}" var="country">
        <option value="${country.key}">${country.value}</option>
    </c:forEach>
</select>
</body>
</html>
