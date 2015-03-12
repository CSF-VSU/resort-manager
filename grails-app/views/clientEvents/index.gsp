<%--
  Created by IntelliJ IDEA.
  User: agpopikov
  Date: 04/03/15
  Time: 12:43
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="dashboard_client"/>
    <title>События клиента</title>
</head>

<body>
<div class="col-lg-12">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title"><i class="fa fa-money fa-fw"></i> Ваши события</h3>
        </div>

        <div class="panel-body">
            <div class="table-responsive">
                <table class="table table-bordered table-hover table-striped">
                    <thead>
                    <tr>
                        <th>Событие №</th>
                        <th>Название</th>
                        <th>Дата начала</th>
                        <th>Дата окончания</th>
                        <th>Место проведения</th>
                        <th>Цена</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <g:each in="${userEvents}" var="userEvent">
                            <td>${userEvent.id}</td>
                            <td>${userEvent.name}</td>
                            <td><d:extendedDate date="${userEvent.fromDate}"/></td>
                            <td><d:extendedDate date="${userEvent.toDate}"/></td>
                            <td>${userEvent.place}</td>
                            <td>${userEvent.price}</td>
                        </g:each>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

<div class="col-lg-12">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title"><i class="fa fa-money fa-fw"></i> Все события</h3>
        </div>

        <div class="panel-body">
            <div class="table-responsive">
                <table class="table table-bordered table-hover table-striped">
                    <thead>
                    <tr>
                        <th>Событие №</th>
                        <th>Название</th>
                        <th>Дата начала</th>
                        <th>Дата окончания</th>
                        <th>Место проведения</th>
                        <th>Цена</th>
                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${allEvents}" var="event">
                        <tr>
                            <td>${event.id}</td>
                            <td>${event.name}</td>
                            <td><d:extendedDate date="${event.fromDate}"/></td>
                            <td><d:extendedDate date="${event.toDate}"/></td>
                            <td>${event.place}</td>
                            <td>${event.price}</td>

                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>

</body>
</html>