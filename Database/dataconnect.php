<?php

$dbServername = "localhost"; //servername in ""
$dbUsername = "root";  // erstelle username (root ist default wenn nicht onilne server gillt)
$dbPassword = "";  // default password empty online muss geändert werden
$dbName = "essen"; // name der Datenbank (kann alles sein )

$conn = mysqli_connect($dbServername, $dbUsername, $dbPassword, $dbName);

?>