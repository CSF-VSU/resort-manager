<%--
  Created by IntelliJ IDEA.
  User: agpopikov
  Date: 08/04/15
  Time: 01:44
--%>

<%@ page import="rm.webapp.domain.Client" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<div class="row">
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                Все клиенты
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover">
                        <thead>
                        <tr>
                            <th>#</th>
                            <th>ФИО</th>
                            <th>E-Mail</th>
                            <th>Номер телефона</th>
                            <th>Паспорт</th>
                        </tr>
                        </thead>
                        <tbody>
                        <g:each in="${clients}" var="client1">
                            <tr>
                                <td>${client.id}</td>
                                <td>${client.lastName} ${client.firstName} ${client.middleName}</td>
                                <td>${client.phone}</td>
                                <td>${client.passport}</td>
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
</div>
</body>
</html>