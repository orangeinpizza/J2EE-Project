<%-- 
    Document   : AdminHome
    Author     : Chinmay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administration Login</title>
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
        background-image: url("https://natureconservancy-h.assetsadobe.com/is/image/content/dam/tnc/nature/en/photos/tnc_69881045.jpg?crop=240,0,2400,1320&wid=4000&hei=2200&scl=0.6");
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
                response.sendRedirect("AdminLogin.jsp");
            }
        %>
        <div class="toolbar">
            &nbsp;&nbsp;
            <a class="main" id="fonts"><strong>KNOWLEDGE  PLAZA</strong></a>
        </div>
        
        <div class="fit">
            <div class="head" style="color:black;">ADMIN SECTION</div>
            <hr width="75%">
            <p class="head" style="color:black;font-size: 26px;">Here, you can view and delete any material of your choice. And can make changes as per required by you.</p>
            <a href="AdminServlet2?page=try" style="font-size: 25px;text-align: center;text-decoration: underline;color: black;">View Books.</a>
            <a href="#" style="font-size: 25px;text-align: center;text-decoration: underline;color: black;">View Donations.</a>
            <a href="#" style="font-size: 25px;text-align: center;text-decoration: underline;color: black;">View Feedback.</a>
            
            <div style="height: 30px;margin-left: 690px;">
                <form action="Logout">
                    <table>
                        <tr>
                            <td><input type="submit" value="Logout"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>    
    </body>
</html>
