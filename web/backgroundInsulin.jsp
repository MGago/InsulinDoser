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

        <title>Background Insulin Dose</title>

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
                    <center>
                        <s:if test="hasActionErrors()">
                            <div class="errors">
                                <s:actionerror/>
                            </div>
                        </s:if>
                    </center>
                    <hr>

                </div>
            </div>
        </header>

        <section class="bg-primary" id="form1">
            <div class="container">
                <div class="row">
                    <div class="offset4 span4">
                        <form class="form-horizontal" action="BackgroundInsulin" method="POST" autocomplete = "off">
                            <div class="form-group">
                                <div class="input-group">
                                    <div class="input-group-addon">Weight:</div>
                                    <input name="weight" id="weight" type="number" class="form-control" min="40" max="130" placeholder="Between 40 and 130" required>
                                    <div class="input-group-addon">Kg</div>
                                </div>
                            </div>
                            <div class="form-actions">
                                <input id="submitButton" type="hidden" class="btn btn-default btn-xl btn-color" value="Calculate">
                            </div>
                        </form>
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
        <script src="js/style.js"></script>

    </body>
</html>