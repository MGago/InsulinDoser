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

        <title>Mealtime Insulin Dose</title>

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">

        <!-- Custom Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>

        <!-- Custom CSS -->
        <link rel="stylesheet" type="text/css" href="css/styles.css">

        <script type="text/javascript" >


        </script>
    </head>

    <body>

        <header>
            <div class="header-content">
                <div class="header-content-inner">
                    <a href="index.jsp"><h1> o que procura? </h1></a>
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

        <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="js/bootstrap.js"></script>
        <script src="js/style.js"></script>

    </body>
</html>