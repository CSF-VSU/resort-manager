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
    <asset:stylesheet href="frameworks/bootstrap.min.css"/>
    <asset:stylesheet href="auth.css"/>
</head>

<body>

<div class="container">

    <g:form action="signin" class="form-signin">
        <h2 class="form-signin-heading">Resort Manager</h2>
        <label for="inputEmail" class="sr-only">Адрес электронной почты</label>
        <input id="inputEmail" name="email" class="form-control" placeholder="Адрес электронной почты" required="" autofocus="" type="email">
        <label for="inputPassword" class="sr-only">Пароль</label>
        <input id="inputPassword" name="password" class="form-control" placeholder="Пароль" required="" type="password">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Вход</button>
    </g:form>

</div>

</body>
</html>