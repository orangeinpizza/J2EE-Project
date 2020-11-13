<%-- 
    Document   : Job
    Author     : Chinmay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Customer"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Knowledge Plaza : Nourishing Future.</title>
        <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
        <link rel="stylesheet" href="Job-style.css">
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
    </head>
    <body>
        <%
            if(session.getAttribute("User")==null)
            {
                response.sendRedirect("Login.jsp");
            }
            
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        %>
        <div class="toolbar">
            &nbsp;&nbsp;
            <a class="main" id="fonts"><strong>KNOWLEDGE  PLAZA</strong></a>
            <a class="clicks" title="ABOUT US" href="Home.jsp" target="_blank">HOME</a>
            <a class="clicks" title="CONTACT US" href="Contact.jsp" target="_blank">REACH US & DONATE</a>
        </div>
        <div style="background-color:gainsboro;height: 40px;color:black;padding-left: 40px;padding-top: 15px;font-family: Candara;font-size: 20px;">
            Welcome, ${User}! 
        </div>
        <div style="height: 230px;width: 100%;background-color: whitesmoke;padding-top: 0px;">
            <h1 style="text-align: center;font-size: 35px;font-family: Candara;color: #75787c">Shoppers Stop</h1><hr width="75%">  
            <p style="text-align: left;font-size: 30px;padding-left: 70px;padding-right: 35px;font-family: Candara;">
                <strong style="font-size:40px;">Ready To Make A Transaction?</strong><br>
                <i>There are various people in our site, which are all set to make a deal with you.</i><br>
            </p>
        </div>
        <div class="row">
            <div id="half1" class="column" style="background-color:lightslategray;font-family: Arial;font-size: 20px;">
                <h1 style="text-align: center;font-size: 35px;font-family: Candara;color: black;">Rent / Giveaway</h1><hr width="75%">
                <p><i>Meet a Person who has a need of your item and figure out how much period to giveaway. Here you can even consider to make a free giveaway.<br>
                <b><a class="dow" href="Sell.jsp" style="text-decoration: none;color:black;">Click Here.</a></b></i></p>
            </div>
            <div id="half2" class="column" style="font-family: Arial;font-size: 20px;color: whitesmoke;">
                <h1 style="text-align: center;font-size: 35px;font-family: Candara;">Rent From</h1><hr width="75%">
                <p><i>Requiring some Stuff?<br>Meet a person who can lend it to you for a particular amount of period.
                <br><b><a class="dob" href="BuyServlet1?page=try" style="text-decoration: none;color: whitesmoke;">Click Here.</a></b></i></p>
            </div>
        </div>
        <div style="text-align: center;font-size: 30px;font-family: Candara;height: 220px;">
            <h1 style="text-align: center;font-size: 35px;font-family: Candara;color: #75787c">Fund Us</h1><hr width="75%"> 
            <p style="text-align: left;font-size: 30px;padding-left: 70px;padding-right: 35px;font-family: Candara;">
                <strong style="font-size:40px;">Consider A Donation?</strong><br>
                <i>You can make a Donation for the future of other peoples Life by giving your small share to them.</i><br>
            </p>
        </div>
        <img height="300px" width="100%" src="https://images.unsplash.com/photo-1504805572947-34fad45aed93?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=96e8c52b31b6e86b4abf5a20d9845793&auto=format&fit=crop&w=1050&q=80">
        <div style="text-align: center;font-size: 30px;font-family: Candara;height: 120px;">
            <p><i>Donate Your Part Here. <a href="Donate.jsp" style="text-decoration: none;color: green;font-size: 50px;"><b>Donate</b></a></i></p>
            <hr>
        </div>
        <div style="height: 30px;margin-left: 720px;">
            <form action="Logout">
                <table>
                    <tr>
                        <td><input type="submit" value="Logout"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
