<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title><g:layoutTitle default="Resort Manager "/></title>
    <asset:stylesheet href="frameworks/bootstrap.min.css"/>
    <asset:stylesheet href="frameworks/sb-admin.css"/>
    <asset:stylesheet href="frameworks/morris.css"/>
    <asset:stylesheet href="frameworks/font-awesome/css/font-awesome.min.css"/>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

<div id="wrapper">

    <!-- Navigation -->
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Resort Manager</a>
        </div>
        <!-- Top Menu Items -->
        <ul class="nav navbar-right top-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <i class="fa fa-user"></i>
                    %{-- todo --}%
                    <b class="caret"></b>
                </a>
                <ul class="dropdown-menu">
                    <li>
                        <a href="#"><i class="fa fa-fw fa-power-off"></i>Выйти</a>
                    </li>
                </ul>
            </li>
        </ul>
        <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav side-nav">
                <li class="active">
                    <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i
                            class="fa fa-fw fa-arrows-v"></i> Номера <i class="fa fa-fw fa-caret-down"></i></a>
                    <ul class="collapse">
                        <li>
                            <a href="#">Бронирование</a>
                        </li>
                        <li>
                            <a href="#">История</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#" data-toggle="collapse" data-target="#demo"><i
                            class="fa fa-fw fa-arrows-v"></i> Услуги <i class="fa fa-fw fa-caret-down"></i></a>
                    <ul class="collapse">
                        <li>
                            <a href="#">Заказ услуг</a>
                        </li>
                        <li>
                            <a href="#">История</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="fa fa-fw fa-bar-chart-o"></i> События</a>
                </li>
            </ul>
        </div>
    </nav>

    <div id="page-wrapper">

        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Панель управления
                    </h1>
                    <ol class="breadcrumb">
                        <li class="active">
                            <i class="fa fa-dashboard"></i> Панель управления
                        </li>
                    </ol>
                </div>
            </div>
            <!-- /.row -->
            <g:layoutBody/>
        </div>
    </div>
</div>

<asset:javascript src="frameworks/jquery.js"/>
<asset:javascript src="frameworks/bootstrap.min.js"/>
<asset:javascript src="frameworks/plugins/morris/raphael.min.js"/>
<asset:javascript src="frameworks/plugins/morris/morris.min.js"/>
<asset:javascript src="frameworks/plugins/morris/morris-data.js"/>

</body>

</html>
