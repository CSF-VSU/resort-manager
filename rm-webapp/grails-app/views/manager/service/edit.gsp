<%--
  Created by IntelliJ IDEA.
  User: andreypopikov
  Date: 11/04/15
  Time: 22:32
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="manager">
    <title></title>
</head>

<body>
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Услуги</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>

<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Редактирование услуги
            </div>

            <div class="panel-body">
                <div class="row">
                    <div class="col-lg-12">
                        <g:form controller="managerService" action="save" role="form" method="post">
                            <div class="form-group has-error">
                                <label>Название</label>
                                <g:if test="${service == null}">
                                    <g:textField name="title" type="text" class="form-control" placeholder="Название услуги..."/>
                                </g:if>
                                <g:else>
                                    <g:textField name="title" type="text" class="form-control" value="${service.title}"/>
                                </g:else>
                            </div>

                            <div class="form-group has-error">
                                <label>Описание</label>
                                <g:if test="${service == null}">
                                    <g:textArea name="description" class="form-control" rows="3" placeholder="Описание..."/>
                                </g:if>
                                <g:else>
                                    <g:textArea name="description" class="form-control" rows="3" value="${service.description}"/>
                                </g:else>
                            </div>

                            <div class="form-group has-error">
                                <label>Телефон</label>
                                <g:if test="${service == null}">
                                    <g:textField name="phone" class="form-control" placeholder="Телефон..."/>
                                </g:if>
                                <g:else>
                                    <g:textField name="phone" class="form-control" value="${service.phone}"/>
                                </g:else>
                            </div>
                            <g:actionSubmit class="btn btn-primary" value="Сохранить"/>
                            <button type="submit" class="btn btn-danger"
                                formaction="<g:createLink controller="managerService" action="index" />">Отмена</button>
                        </g:form>
                    </div>
                </div>
                <!-- /.row (nested) -->
            </div>
            <!-- /.panel-body -->
        </div>
        <!-- /.panel -->
    </div>
</div>

</body>
</html>