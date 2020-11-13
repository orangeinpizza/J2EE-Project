<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Register</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
        <link rel="stylesheet" href="Register-style.css">
        <link rel="icon" href="https://images.babytidings.com/images/11/1245355919393_38/img_large_watermarked.jpg" type="image/gif" sizes="16x16">
        <style>
        html, body{
        height:100%;
        padding:0px;
        margin:0px;
        background-color: whitesmoke;
        box-sizing: border-box;
        }
        #fonts{
        font-family: 'Abel', sans-serif;
        }
        </style>
        
        <script type="text/javascript">
            function validate()
            {
                if( document.myForm.username.value === "" )
                {
                    alert( "Please Provide User Name!" );
                    document.myForm.username.focus() ;
                    return false;
                }

                if( document.myForm.email.value === "" )
                {
                    alert( "Please provide your Email!" );
                    document.myForm.email.focus() ;
                    return false;
                }
                
                atpos = document.myForm.email.value.indexOf("@");
                dotpos = document.myForm.email.value.lastIndexOf(".");
                int i=0;
                if (atpos < 1 || ( dotpos - atpos < 2 )) {
                    i=1;
                }
                if(i===1){
                    alert( "Please provide your correct Email!" );
                    document.myForm.email.focus() ;
                    return false;
                }
                
                
                if( document.myForm.email.value === "" )
                {
                    alert( "Please provide your Email!" );
                    document.myForm.email.focus() ;
                    return false;
                }
                
                
                if( document.myForm.password.value === "" )
                {
                    alert( "Please provide Password!" );
                    document.myForm.password.focus() ;
                    return false;
                }
                
                if( document.myForm.password2.value === "" )
                {
                    alert( "Please confirm Password!" );
                    document.myForm.password.focus() ;
                    return false;
                }
               
                if( document.myForm.address.value === "" )
                {
                    alert( "Please provide Correct Address!" );
                    document.myForm.address.focus() ;
                    return false;
                }
                
                if( document.myForm.phone.value === "" )
                {
                    alert( "Please provide Phone!" );
                    document.myForm.phone.focus() ;
                    return false;
                }
                
                if( document.myForm.password.value !== document.myForm.password2.value)
                {
                    alert( "Password Didnt Match!" );
                    document.myForm.password.focus() ;
                    return false;
                }
                
               return( true );
            }  
            function checkEmail() {

            var email = document.getElementById('email');
            var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

            if (!filter.test(email.value)) {
            alert('Please provide a valid email address');
            email.focus;
            return false;
         }
        </script>
        
    </head>
    <body>
        <div class="toolbar">
            &nbsp;&nbsp;
            <a class="main" id="fonts"><strong>KNOWLEDGE  PLAZA</strong></a>
            <a class="clicks" title="CONTACT US" href="Contact.jsp" target="_blank">REACH US & DONATE</a>
            <a class="clicks" title="ABOUT US" href="Home.jsp" target="_blank">HOME</a>
        </div>
        
        <div class="fullform">
            <form action="RegisterServlet1" name="myForm" method="POST" onsubmit="return(validate());"><br>
                <div id="heads">REGISTER</div><hr style="color:white; width: 75%;">
                <table id="tab">
                <tr>
                    <td>Enter Name :</td>
                    <td><input type="text" name="username" placeholder="Username" size="40"></td>
                </tr>
                <tr>
                    <td>Enter Email :</td>
                    <td><input type="text" name="email" placeholder="@example.com" size="40"></td>
                </tr>
                <tr>
                    <td>Enter Password :</td>
                    <td><input type="password" name="password" placeholder="Password" size="40"></td>
                </tr>
                <tr>
                    <td>Confirm Password :</td>
                    <td><input type="password" name="password2" placeholder="Password" size="40"></td>
                </tr>
                <tr>
                    <td>Enter Address :</td>
                    <td><textarea type="bigtext" name="address" placeholder="Enter Your Address Here" rows="4" cols="45"></textarea></td>
                </tr>
                <tr>
                    <td>Enter Contact No :</td>
                    <td><input type="text" name="phone" placeholder="Phone no" size="40"></td>
                </tr>
                <tr>
                    <td style="padding-top: 15px;padding-bottom: 25px;"><input type="radio" name="gender" value="male" checked> Accept Our Terms & Conditions.</td>
                </tr>
                <tr>
                    <td><input type="submit" name="Submit"></td>
                    <td><input type="reset" name="Clear"></td>
                </tr>
                </table>
            </form>
        </div>
    </body>
</html>
