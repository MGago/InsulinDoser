<%-- 
    Document   : index
    Created on : May 6, 2015, 2:04:02 AM
    Author     : mariogago
--%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Insulin Doser</title>

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

        <!-- Custom Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

        <!-- Custom CSS -->
        <link rel="stylesheet" type="text/css" href="css/styles.css">
    </head>

    <body>

        <header>
            <div class="header-content">
                <div class="header-content-inner">
                    <a href="index.jsp"><h1>Insulin Doser</h1></a>
                    <hr>
                    <p>This web application allows you to calculate three different types of insulin doses for diabetes type-2. Just select the option you pretend to know.</p>
                </div>
            </div>
        </header>

        <section class="bg-primary menu" id="menu">
            <div class="container">
                <div class="row">
                    <div class="offset4 span4 text-center">
                        <a href="insulin.jsp" class="btn btn-default btn-xl">Mealtime Insulin Dose</a>
                        <a href="personalInsulin.jsp" class="btn btn-default btn-xl">Personalized Mealtime Insulin Dose</a>
                        <a href="backgroundInsulin.jsp" class="btn btn-default btn-xl">Background Insulin Dose</a>
                    </div>
                </div>
            </div>
        </section>

        <div class="navbar navbar-default navbar-fixed-bottom">
            <div class="container">
                <p class="navbar-text">MEI - FCTUC <br> @2015</p><br>
            </div>
        </div>

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="js/bootstrap.js"></script>

    </body>
</html>