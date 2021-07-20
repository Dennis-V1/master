<?php
    include_once 'includes/dataconnect.php';
?>

<!DOCTYPE html>
<html>
<head>
    <title>Databasetest</title>
</head>
<body>
<form>
    <input type="text" name = "frucht" placeholder = "Frucht">
    <br>
    <input type="double" name = "preis" placeholder = "Preis">
    <br>
    <button type = "submit" name = "submit">submit fruit</button>
</form>

<?php
    $sql ="SELECT * FROM essen;";  // semicolon ist von sql code das zweite um php zu schließen
    $sql = "INSERT INTO essen (essen_bezeichnung, essen_preis)
    Values ('Banane', '1.5');";

    //$result = mySQLi_query($conn, $sql);
    //$resultCheck = mySQLi_num_rows($result);
    
    //if ($resultCheck > 0) {
    //    while ($row = mysqli_fetch_assoc($result)){
    //        echo $row['essen_bezeichnung'] . "<br>";
    //    }
    //}
?>


</body>


</html>