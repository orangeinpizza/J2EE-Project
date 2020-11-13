<!DOCTYPE html>
<!--Login Page Of The Site-->
<html>
    <head>
        <title>Login Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Login-style.css">
        <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
        <link rel="icon" href="https://images.babytidings.com/images/11/1245355919393_38/img_large_watermarked.jpg" type="image/gif" sizes="16x16">
        <style>
        html, body{
        height:100%;
        padding:0px;
        margin:0px;
        background-image: url("https://images.unsplash.com/photo-1522071820081-009f0129c71c?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=581511fae3d6e46d55eb0b6f3d86b69d&auto=format&fit=crop&w=1950&q=80");
        }
        #fonts{
        font-family: 'Abel', sans-serif;
        }
        </style>
    </head>
    
    <body>
        <div class="toolbar">
            &nbsp;&nbsp;
            <a class="main" id="fonts"><strong>KNOWLEDGE  PLAZA</strong></a>
            <a class="clicks" title="CONTACT US">CONTACT US</a>
            <a class="clicks" title="ABOUT US" href="Home.jsp" target="_blank">HOME</a>
        </div>
           
        <div class="forms">
            <form action="LoginServlet1" method="POST"><br>
                <div id="heads">LOGIN HERE</div><hr width="75%"><br>
                <table class="tab">
                <tr>
                    <td>Enter Name :</td>
                    <td><input type="text" name="username" placeholder="Username"></td>
                </tr>
                <tr>
                    <td>Enter Password :</td>
                    <td><input type="password" name="password" placeholder="Password"></td>
                </tr>   
                <tr>
                    <td><input type="submit" name="Login"></td>
                    <td><input type="reset" name="Clear"></td>
                </tr>    
                </table>
                
                <a href="Register.jsp" class="reg"><i>Not Registered ?</i></a>
                <a href="AdminLogin.jsp" class="reg" style="color: red;"><i>Admin Login</i></a>
            </form>
        </div>       
    </body>
</html>
