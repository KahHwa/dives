
<?php
include_once("connect.php");
if( isset($_POST['txtUsername']) && isset($_POST['txtPassword']) ) { 
        $username = $_POST['txtUsername'];
        $password = $_POST['txtPassword'];
        
        $query = "SELECT username, password FROM UserFrontPage ". 
        " WHERE username = '$username' AND password = '$password'"; 
        
        $result = mysqli_query($conn, $query);
        
                if($result->num_rows > 0){
                    if(isset($_POST['mobile']) && $_POST['mobile'] == "android"){ 
                        echo "success"; 
                        exit; 
                    } 
                     echo "Login Successfull";
                  }
                         //header("location: index.php"); //replace index.php with your url
} 
else{ 
            echo "Login Failed <br/>"; 
    } 
    


?>


//create the http form 

<html>
<head><title> DIVES APP</title></head>
    <body>
        <h1> Login Data </h1>
        <form action="<?PHP $_PHP_SELF ?>" method="post">
            Username <input type="text" name="txtUsername" value="" /> <br/>
            Password <input type="password" name="txtPassword" value="" /> <br/>
            <input type="submit" name="btnSubmit" value="Login" /> <br/>
        </form>
    </body>
</html>
