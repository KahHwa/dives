<?php
$servername = 'localhost'; //please replace this with your database server name
$username = 'username'; //replace with database username
$password = 'password'; //replace with database password
$dbname = 'UserFrontPage'; //databaase name

// Create connection
$conn = mysqli_connect($servername, $username, $password, $dbname);

// Check connection
if (!$conn) {
    die('Connection failed: ' . mysqli_connect_error());
}
else
{
    echo 'Connected Successfully';
    if(mysqli_select_db($dbname))
    {
        echo 'Database Connected';
    }
}



mysqli_close($conn);
?>