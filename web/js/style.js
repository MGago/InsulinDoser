/* DATA FIELD VALIDATION */

/* Form Input fields validation */
$(document).keyup(function ()
{
    // Mealtime Insulin Dose
    if (document.title == "Mealtime Insulin Dose") {
        var carbsMeal = parseInt(document.getElementById('carbsMeal').value);
        var carbsUnit = parseInt(document.getElementById('carbsUnit').value);
        var actualBloodSugar = parseInt(document.getElementById('actualBloodSugar').value);
        var targetBloodSugar = parseInt(document.getElementById('targetBloodSugar').value);
        var individualSensitivity = parseInt(document.getElementById('individualSensitivity').value);

        if ((carbsMeal >= 60 && carbsMeal <= 120) &&
                (carbsUnit >= 10 && carbsUnit <= 15) &&
                (actualBloodSugar >= 120 && actualBloodSugar <= 250) &&
                (targetBloodSugar >= 80 && targetBloodSugar <= 120) &&
                (individualSensitivity >= 15 && individualSensitivity <= 100))
        {
            document.getElementById("submitButton").type = 'submit';
        } else {
            document.getElementById("submitButton").type = 'hidden';
        }
    }
    // Background Insulin Dose
    if (document.title == "Background Insulin Dose") {
        var weight = parseInt(document.getElementById('weight').value);

        if (weight >= 40 && weight <= 130)
        {
            document.getElementById("submitButton").type = 'submit';
        } else {
            document.getElementById("submitButton").type = 'hidden';
        }
    }
    // Personalized Insulin Dose
    if (document.title == "Personalized Mealtime Insulin Dose") {

        console.log("WTF!");

        // Input data vars
        var carbsMeal = parseInt(document.getElementById('carbsMeal').value);
        var carbsUnit = parseInt(document.getElementById('carbsUnit').value);
        var actualBloodSugar = parseInt(document.getElementById('actualBloodSugar').value);
        var targetBloodSugar = parseInt(document.getElementById('targetBloodSugar').value);
        var physicalActivity = parseInt(document.getElementById('physicalActivity').value);
        var physicalSamples0 = parseInt(document.getElementById('physicalSamples0').value);
        var bloodSamples0 = parseInt(document.getElementById('bloodSamples0').value);
        var physicalSamples1 = parseInt(document.getElementById('physicalSamples1').value);
        var bloodSamples1 = parseInt(document.getElementById('bloodSamples1').value);

        //How many checked boxes?
        var locks = 0;
        var keys = 0;

        if (carbsMeal >= 60 && carbsMeal <= 120)
            console.log("1");
        if (carbsUnit >= 10 && carbsUnit <= 15)
            console.log("2");
        if (actualBloodSugar >= 120 && actualBloodSugar <= 250)
            console.log("3");
        if (targetBloodSugar >= 80 && targetBloodSugar <= 120)
            console.log("4");
        if (physicalActivity >= 0 && physicalActivity <= 10)
            console.log("5");
        if (physicalSamples0 >= 0 && physicalSamples0 <= 10)
            console.log("6");
        if (bloodSamples0 >= 15 && bloodSamples0 <= 100)
            console.log("7");
        if (physicalSamples1 >= 0 && physicalSamples1 <= 10)
            console.log("8");
        if (bloodSamples1 >= 15 && bloodSamples1 <= 100)
            console.log("9");

        if ((carbsMeal >= 60 && carbsMeal <= 120) &&
                (carbsUnit >= 10 && carbsUnit <= 15) &&
                (actualBloodSugar >= 120 && actualBloodSugar <= 250) &&
                (targetBloodSugar >= 80 && targetBloodSugar <= 120) &&
                (physicalActivity >= 0 && physicalActivity <= 10) &&
                (physicalSamples0 >= 0 && physicalSamples0 <= 10) &&
                (bloodSamples0 >= 15 && bloodSamples0 <= 100) &&
                (physicalSamples1 >= 0 && physicalSamples1 <= 10) &&
                (bloodSamples1 >= 15 && bloodSamples1 <= 100))
        {
            console.log("if");

            if ($("#checkbox2").is(':checked'))
            {
                var bloodSamples2 = parseInt(document.getElementById('bloodSamples2').value);
                var physicalSamples2 = parseInt(document.getElementById('physicalSamples2').value);

                console.log("lock++");
                locks++;

                if ((bloodSamples2 >= 15 && bloodSamples2 <= 100) &&
                        (physicalSamples2 >= 0 && physicalSamples2 <= 10))
                {
                    console.log("key++");
                    keys++;
                }
                ;
            }
            if ($("#checkbox3").is(':checked'))
            {
                var bloodSamples3 = parseInt(document.getElementById('bloodSamples3').value);
                var physicalSamples3 = parseInt(document.getElementById('physicalSamples3').value);

                locks++;

                if ((bloodSamples3 >= 15 && bloodSamples3 <= 100) &&
                        (physicalSamples3 >= 0 && physicalSamples3 <= 10))
                {
                    keys++;
                }
                ;
            }
            if ($("#checkbox4").is(':checked'))
            {
                var bloodSamples4 = parseInt(document.getElementById('bloodSamples4').value);
                var physicalSamples4 = parseInt(document.getElementById('physicalSamples4').value);

                locks++;

                if ((bloodSamples4 >= 15 && bloodSamples4 <= 100) &&
                        (physicalSamples4 >= 0 && physicalSamples4 <= 10))
                {
                    keys++;
                }
                ;
            }
            if ($("#checkbox5").is(':checked'))
            {
                var bloodSamples5 = parseInt(document.getElementById('bloodSamples5').value);
                var physicalSamples5 = parseInt(document.getElementById('physicalSamples5').value);

                locks++;

                if ((bloodSamples5 >= 15 && bloodSamples5 <= 100) &&
                        (physicalSamples5 >= 0 && physicalSamples5 <= 10))
                {
                    keys++;
                }
                ;
            }
            if ($("#checkbox6").is(':checked'))
            {
                var bloodSamples6 = parseInt(document.getElementById('bloodSamples6').value);
                var physicalSamples6 = parseInt(document.getElementById('physicalSamples6').value);

                locks++;

                if ((bloodSamples6 >= 15 && bloodSamples6 <= 100) &&
                        (physicalSamples6 >= 0 && physicalSamples6 <= 10))
                {
                    keys++;
                }
                ;
            }
            if ($("#checkbox7").is(':checked'))
            {
                var bloodSamples7 = parseInt(document.getElementById('bloodSamples7').value);
                var physicalSamples7 = parseInt(document.getElementById('physicalSamples7').value);

                locks++;

                if ((bloodSamples7 >= 15 && bloodSamples7 <= 100) &&
                        (physicalSamples7 >= 0 && physicalSamples7 <= 10))
                {
                    keys++;
                }
                ;
            }
            if ($("#checkbox8").is(':checked'))
            {
                var bloodSamples8 = parseInt(document.getElementById('bloodSamples8').value);
                var physicalSamples8 = parseInt(document.getElementById('physicalSamples8').value);

                locks++;

                if ((bloodSamples8 >= 15 && bloodSamples8 <= 100) &&
                        (physicalSamples8 >= 0 && physicalSamples8 <= 10))
                {
                    keys++;
                }
                ;
            }
            if ($("#checkbox9").is(':checked'))
            {
                var bloodSamples9 = parseInt(document.getElementById('bloodSamples9').value);
                var physicalSamples9 = parseInt(document.getElementById('physicalSamples9').value);

                locks++;

                if ((bloodSamples9 >= 15 && bloodSamples9 <= 100) &&
                        (physicalSamples9 >= 0 && physicalSamples9 <= 10))
                {
                    keys++;
                }
                ;
            }

            if (keys == locks)
                document.getElementById("submitButton").type = 'submit';
            else
                document.getElementById("submitButton").type = 'hidden';

        } else {
            console.log("else");
            document.getElementById("submitButton").type = 'hidden';
        }
    }
});


/* CHECKBOX - INPUT FIELD RELATION */

$("#checkbox2").click(function () {
    if ($("#checkbox2").is(':checked')) {
        document.getElementById("physicalSamples2").readOnly = false;
        document.getElementById("bloodSamples2").readOnly = false;
    } else {
        document.getElementById("physicalSamples2").readOnly = true;
        document.getElementById("bloodSamples2").readOnly = true;
    }
});

$("#checkbox3").click(function () {
    if ($("#checkbox3").is(':checked')) {
        document.getElementById("physicalSamples3").readOnly = false;
        document.getElementById("bloodSamples3").readOnly = false;
    } else {
        document.getElementById("physicalSamples3").readOnly = true;
        document.getElementById("bloodSamples3").readOnly = true;
    }
});

$("#checkbox4").click(function () {
    if ($("#checkbox4").is(':checked')) {
        document.getElementById("physicalSamples4").readOnly = false;
        document.getElementById("bloodSamples4").readOnly = false;
    } else {
        document.getElementById("physicalSamples4").readOnly = true;
        document.getElementById("bloodSamples4").readOnly = true;
    }
});

$("#checkbox5").click(function () {
    if ($("#checkbox5").is(':checked')) {
        document.getElementById("physicalSamples5").readOnly = false;
        document.getElementById("bloodSamples5").readOnly = false;
    } else {
        document.getElementById("physicalSamples5").readOnly = true;
        document.getElementById("bloodSamples5").readOnly = true;
    }
});

$("#checkbox6").click(function () {
    if ($("#checkbox6").is(':checked')) {
        document.getElementById("physicalSamples6").readOnly = false;
        document.getElementById("bloodSamples6").readOnly = false;
    } else {
        document.getElementById("physicalSamples6").readOnly = true;
        document.getElementById("bloodSamples6").readOnly = true;
    }
});

$("#checkbox7").click(function () {
    if ($("#checkbox7").is(':checked')) {
        document.getElementById("physicalSamples7").readOnly = false;
        document.getElementById("bloodSamples7").readOnly = false;
    } else {
        document.getElementById("physicalSamples7").readOnly = true;
        document.getElementById("bloodSamples7").readOnly = true;
    }
});

$("#checkbox8").click(function () {
    if ($("#checkbox8").is(':checked')) {
        document.getElementById("physicalSamples8").readOnly = false;
        document.getElementById("bloodSamples8").readOnly = false;
    } else {
        document.getElementById("physicalSamples8").readOnly = true;
        document.getElementById("bloodSamples8").readOnly = true;
    }
});

$("#checkbox9").click(function () {
    if ($("#checkbox9").is(':checked')) {
        document.getElementById("physicalSamples9").readOnly = false;
        document.getElementById("bloodSamples9").readOnly = false;
    } else {
        document.getElementById("physicalSamples9").readOnly = true;
        document.getElementById("bloodSamples9").readOnly = true;
    }
});

