<%--
  Created by IntelliJ IDEA.
  User: agpopikov
  Date: 05/04/15
  Time: 23:39
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <g:include view="shared/header.gsp"/>
</head>

<body>
<div class="container">
    <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-4 col-md-offset-4 col-sm-8 col-sm-offset-2">
        <div class="panel panel-info">
            <div class="panel-heading">
                <div class="panel-title">Resort Manager</div>

                <div style="float:right; font-size: 80%; position: relative; top:-18px"><a href="#">Забыли пароль?</a>
                </div>
            </div>

            <div style="padding-top:30px" class="panel-body">
                <g:if test="${error != null}">
                    <div id="login-alert" class="alert alert-danger col-sm-12">
                        ${error}
                    </div>
                </g:if>

                <g:form action="index" method="POST" class="form-horizontal" role="form">

                    <div style="margin-bottom: 15px" class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input id="login-username" type="text" class="form-control" name="email" value=""
                               placeholder="Ваш E-Mail">
                    </div>

                    <div style="margin-bottom: 15px" class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                        <input id="login-password" type="password" class="form-control" name="password"
                               placeholder="Ваш пароль">
                    </div>

                    <div style="margin-top:10px" class="form-group pull-right">
                        <div class="col-sm-12 controls">
                            <input type="submit" class="btn btn-success" value="Войти"/>
                        </div>
                    </div>

                </g:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>