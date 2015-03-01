<%--
  Created by IntelliJ IDEA.
  User: agpopikov
  Date: 01/03/15
  Time: 01:13
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title></title>
</head>
<body>

<g:form action="signin">
    <g:if env="${error != null}">
        <label>${error}</label>
    </g:if>
    <label>EMail:</label>
    <g:textField name="email" />
    <label>Пароль:</label>
    <g:passwordField name="password" />
</g:form>

</body>
</html>