<?php
require 'connect.php';

$query = mysql_query("SELECT Username,Email FROM 'UserFrontPage' ");
if($query)
{
    echo 'Query executed'. '<br>';
    //fetch data from database
    
    $query_execute=mysql_fetch_row($query)
    if ([$row[3]==$_GET('password') && $row[0]=$_GET['username'] ) //check the username & password input == database username and password
        echo "You Sucessfully Logged In". '<br>'; 
        echo "Welcome ". $row[0]. ' !\t'; //Welcome message and get the Username
        echo "You logged in using : ". $row[1]. ' \t'; //show the email
    }
    else
    {
        echo 'Username and Password Does not match';
    }
}
else
{
    echo 'Query not executed'. mysql_error();
}

?>