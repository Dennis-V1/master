<?php
   
    include_once 'includes/dataconnect.php';

    $essen_bezeichnung = $_POST['frucht'];
    $preis = $_POST['preis'];

    $sql ="SELECT * FROM essen;";  // semicolon ist von sql code das zweite um php zu schließen
    $sql = "INSERT INTO essen (essen_bezeichnung, essen_preis)
    Values ('$essen_bezeichnung', '$preis');";
    mysqli_query($conn , $sql);

    header("Location: ../index.php");
?>