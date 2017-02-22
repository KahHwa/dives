<?php
require 'connect.php';

$query = mysql_query("SELECT Skills,Achievement,Hobbies,Academics,AdditionalInfo,Language FROM 'JobFairInfo' ");
if($query)
{
    $query_execute=mysql_fetch_assoc($query))
if ([$row[0]==$_GET('username') && $row[3]=$_GET['password'] ){
    echo $query_executed['Skills']; //display the skills
    echo $query_executed['Achievement']; //display the user achievement
    echo $query_executed['Hobbies']; //display the hobbies
    echo $query_executed['Academics']; //display the academics
    echo $query_executed['AdditionalInfo']; //display the additional info
    echo $query_executed['Language']; //display the user language
}
else
{
    echo 'Query not executed'. mysql_error();
}

?>