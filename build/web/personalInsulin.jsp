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

        <title>Personalized Mealtime Insulin Dose</title>

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

        <section class="bg-primary" id="menu">
            <div class="container">
                <div class="row">
                    <form class="form-horizontal" action="PersonalInsulin" method="POST" autocomplete = "off">
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">Total grams of carbohydrates in the meal:</div>
                                <input name="carbsMeal" id="carbsMeal" type="number" class="form-control" min="60" max="120" placeholder="(Between 60 and 120)" required>
                                <div class="input-group-addon">g</div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">Total grams of carbohydrates processed by 1 unit of rapid acting insulin:</div>
                                <input name="carbsUnit" id="carbsUnit" type="number" class="form-control" min="10" max="15" value="12" placeholder="(Between 10 and 15)" required>
                                <div class="input-group-addon">g</div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">Actual blood sugar level measured before the meal:</div>
                                <input name="actualBloodSugar" id="actualBloodSugar" type="number" class="form-control" min="120" max="250" placeholder="(Between 120 and 250)" required>
                                <div class="input-group-addon">mg/dl</div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">Target blood sugar level before the meal:</div>
                                <input name="targetBloodSugar" id="targetBloodSugar" type="number" class="form-control" min="80" max="120" placeholder="(Between 80 and 120)" required>
                                <div class="input-group-addon">mg/dl</div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <div class="input-group-addon">Today's physical activity level:</div>
                                <input name="physicalActivity" id="physicalActivity" type="number" class="form-control" min="0" max="10" placeholder="(From 0 to 10)" required>
                                <div class="input-group-addon"></div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="input-group">
                                <input type="text" class="form-control" value="Fisical Activity samples" readonly>
                                <div class="input-group-addon"></div>
                                <input type="text" class="form-control" value="Drops in blood sugar samples" readonly>
                            </div>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <input id="checkbox0" type="checkbox" value="" checked="checked" disabled readonly required>
                                </div>
                                <input name="physicalSamples[0]" id="physicalSamples0" type="number" class="form-control" min="0" max="10" placeholder="0-10 level/day" required>
                                <div class="input-group-addon"></div>
                                <input name="bloodSamples[0]" id="bloodSamples0" type="number" class="form-control" min="25" max="100" placeholder="25-100 mg/dl" required>
                                <div class="input-group-addon"></div>
                            </div>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <input id="checkbox1" type="checkbox" value="" checked="checked" disabled readonly required>
                                </div>
                                <input name="physicalSamples[1]" id="physicalSamples1" type="number" class="form-control" min="0" max="10" placeholder="0-10 level/day" required>
                                <div class="input-group-addon"></div>
                                <input name="bloodSamples[1]" id="bloodSamples1" type="number" class="form-control" min="25" max="100" placeholder="25-100 mg/dl" required>
                                <div class="input-group-addon"></div>
                            </div>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <input id="checkbox2" type="checkbox" value="">
                                </div>
                                <input name="physicalSamples[2]" id="physicalSamples2" type="number" class="form-control" min="0" max="10" placeholder="0-10 level/day" readonly>
                                <div class="input-group-addon"></div>
                                <input name="bloodSamples[2]" id="bloodSamples2" type="number" class="form-control" min="25" max="100" placeholder="25-100 mg/dl" readonly>
                                <div class="input-group-addon"></div>
                            </div>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <input id="checkbox3" type="checkbox" value="">
                                </div>
                                <input name="physicalSamples[3]" id="physicalSamples3" type="number" class="form-control" min="0" max="10" placeholder="0-10 level/day" readonly>
                                <div class="input-group-addon"></div>
                                <input name="bloodSamples[3]" id="bloodSamples3" type="number" class="form-control" min="25" max="100" placeholder="25-100 mg/dl" readonly>
                                <div class="input-group-addon"></div>
                            </div>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <input id="checkbox4" type="checkbox" value="">
                                </div>
                                <input name="physicalSamples[4]" id="physicalSamples4" type="number" class="form-control" min="0" max="10" placeholder="0-10 level/day" readonly>
                                <div class="input-group-addon"></div>
                                <input name="bloodSamples[4]" id="bloodSamples4" type="number" class="form-control" min="25" max="100" placeholder="25-100 mg/dl" readonly>
                                <div class="input-group-addon"></div>
                            </div>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <input id="checkbox5" type="checkbox" value="">
                                </div>
                                <input name="physicalSamples[5]" id="physicalSamples5" type="number" class="form-control" min="0" max="10" placeholder="0-10 level/day" readonly>
                                <div class="input-group-addon"></div>
                                <input name="bloodSamples[5]" id="bloodSamples5" type="number" class="form-control" min="25" max="100" placeholder="25-100 mg/dl" readonly>
                                <div class="input-group-addon"></div>
                            </div>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <input id="checkbox6" type="checkbox" value="">
                                </div>
                                <input name="physicalSamples[6]" id="physicalSamples6" type="number" class="form-control" min="0" max="10" placeholder="0-10 level/day" readonly>
                                <div class="input-group-addon"></div>
                                <input name="bloodSamples[6]" id="bloodSamples6" type="number" class="form-control" min="25" max="100" placeholder="25-100 mg/dl" readonly>
                                <div class="input-group-addon"></div>
                            </div>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <input id="checkbox7" type="checkbox" value="">
                                </div>
                                <input name="physicalSamples[7]" id="physicalSamples7" type="number" class="form-control" min="0" max="10" placeholder="0-10 level/day" readonly>
                                <div class="input-group-addon"></div>
                                <input name="bloodSamples[7]" id="bloodSamples7" type="number" class="form-control" min="25" max="100" placeholder="25-100 mg/dl" readonly>
                                <div class="input-group-addon"></div>
                            </div>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <input id="checkbox8" type="checkbox" value="">
                                </div>
                                <input name="physicalSamples[8]" id="physicalSamples8" type="number" class="form-control" min="0" max="10" placeholder="0-10 level/day" readonly>
                                <div class="input-group-addon"></div>
                                <input name="bloodSamples[8]" id="bloodSamples8" type="number" class="form-control" min="25" max="100" placeholder="25-100 mg/dl" readonly>
                                <div class="input-group-addon"></div>
                            </div>
                            <div class="input-group">
                                <div class="input-group-addon">
                                    <input id="checkbox9" type="checkbox" value="">
                                </div>
                                <input name="physicalSamples[9]" id="physicalSamples9" type="number" class="form-control" min="0" max="10" placeholder="0-10 level/day" readonly>
                                <div class="input-group-addon"></div>
                                <input name="bloodSamples[9]" id="bloodSamples9" type="number" class="form-control" min="25" max="100" placeholder="25-100 mg/dl" readonly>
                                <div class="input-group-addon"></div>
                            </div>
                        </div>
                        <div class="form-actions">
                            <input id="submitButton" type="hidden" class="btn btn-default btn-xl btn-color" value="Calculate">
                        </div>
                    </form>
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