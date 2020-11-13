<%-- 
    Document   : AdminLogin
    Author     : Chinmay
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
        <link rel="stylesheet" href="Sell-style.css">
        <link rel="stylesheet" href="Buy-style.css">
        <link rel="stylesheet" href="Login-style.css">
        <link rel="icon" href="https://images.babytidings.com/images/11/1245355919393_38/img_large_watermarked.jpg" type="image/gif" sizes="16x16">
        <style>
        html, body{
        height:100%;
        padding:0px;
        margin:0px;
        background-image: url("https://i.ytimg.com/vi/BickMFHAZR0/maxresdefault.jpg");
        box-sizing: border-box;
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
        
        <div class="forms" style="background-color:whitesmoke;">
            <form action="AdminServlet1" method="POST"><br>
                <div id="heads">LOGIN HERE</div><hr width="75%"><br>
                <table class="tab">
                <tr>
                    <td>Enter Name :</td>
                    <td><input type="text" name="name" placeholder="Admin"></td>
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
            </form>
        </div>
    </body>
</html>
