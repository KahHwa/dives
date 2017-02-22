<?php
$servername = $_GET['localhost'];
$username = $_GET['username'];
$password = $_GET['password'];
$dbname = $_GET['UserFrontPage'];

// Create connection
$conn = mysqli_connect($servername, $username, $password);

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