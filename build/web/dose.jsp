<%-- 
    Document   : dose
    Created on : May 6, 2015, 2:04:02 AM
    Author     : mariogago
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>

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
                </div>
            </div>
        </header>

        <section class="bg-primary dose" id="menu">
            <div class="container">
                <div class="row">
                    <div class="offset4 span4 text-center">
                        <center><h1><s:property value="dose" /></h1></center>
                        <center><h2>units of insulin</h2></center>
                    </div>
                </div>
            </div>
        </section>

    <center>
        <button type="button" class="btn btn-default btn-s btn-color" data-toggle="collapse" data-target="#info">
            + info
        </button>
    </center>
    <div id="info" class="collapse out">


        <section class="bg-primary dose" id="plusData">
            <div class="container" >
                <div class="row">
                    <div class="offset4 span4 text-center">
                        <center>
                            <table class="table-striped" cellspacing="0" width="50%">
                                <thead>
                                    <tr>
                                        <th>Webservice</th>
                                        <th>State</th>
                                        <th>Resultado</th>
                                    </tr>
                                </thead>
                                <tbody>

                                    <s:iterator value="values">

                                        <tr>
                                            <td><s:property value="url"/></td>
                                            <td><s:property value="state"/></td>
                                            <td><s:property value="value" /></td>
                                        </tr>

                                    </s:iterator>

                                </tbody>
                            </table>
                        </center>
                    </div>
                </div>
            </div>
        </section>
    </div>  

    <div class="navbar navbar-default navbar-fixed-bottom">
        <div class="container">
            <p class="navbar-text">MEI - FCTUC <br> @2015</p><br>
        </div>
    </div>

    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>

</body>
</html>