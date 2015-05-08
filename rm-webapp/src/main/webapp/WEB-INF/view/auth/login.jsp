<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andreypopikov
  Date: 03/05/15
  Time: 01:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="hasError" value="${not empty error}"/>
<div class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="text-center">Resort Manager</h1>
            </div>
            <div class="modal-body login-box">
                <c:if test="${hasError}">
                    <h4>${error}</h4>
                </c:if>
                <form class="form col-md-12 center-block" method="post"
                      action="<spring:url value='j_spring_security_check'/>">
                    <div class="form-group ${hasError ? 'has-error' : ''}">
                        <input type="text" class="form-control input-lg text-warning" placeholder="E-Mail..."
                               name="j_username">
                    </div>
                    <div class="form-group ${hasError ? 'has-error' : ''}">
                        <input type="password" class="form-control input-lg" placeholder="Пароль..."
                               name="j_password">
                    </div>
                    <div class="form-group">
                        <button class="btn btn-primary btn-lg btn-block">Войти</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>