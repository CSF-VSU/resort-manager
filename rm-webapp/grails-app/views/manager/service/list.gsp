<%--
  Created by IntelliJ IDEA.
  User: andreypopikov
  Date: 11/04/15
  Time: 22:31
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">Услуги</h1>
    </div>
    <!-- /.col-lg-12 -->
</div>

<div class="col-lg-12">
    <div class="panel panel-default">
        <div class="panel-heading">
            Hover Rows
        </div>
        <!-- /.panel-heading -->
        <div class="panel-body">
            <div class="table-responsive">
                <table class="table table-hover data-table">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>Название услуги</th>
                        <th>Описание</th>
                        <th>Телефон</th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${services}" var="service">
                        <tr>
                            <td>${service.id}</td>
                            <td>${service.title}</td>
                            <td>${service.description}</td>
                            <td>${service.phone}</td>
                            <td></td>
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <!-- /.table-responsive -->
        </div>
        <!-- /.panel-body -->
    </div>
    <!-- /.panel -->
</div>

</body>
</html>