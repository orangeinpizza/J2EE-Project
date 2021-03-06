<%-- 
    Document   : Order
    Author     : Chinmay
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conclude Order</title>
        <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
        <link rel="stylesheet" href="Sell-style.css">
        <link rel="stylesheet" href="Buy-style.css">
        <link rel="icon" href="https://images.babytidings.com/images/11/1245355919393_38/img_large_watermarked.jpg" type="image/gif" sizes="16x16">
        <style>
        html, body{
        height:100%;
        padding:0px;
        margin:0px;
        background-image: url("https://images.unsplash.com/photo-1520034475321-cbe63696469a?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=2efbd126389f0ea2ce0db8c507919e1b&auto=format&fit=crop&w=1050&q=80");
        box-sizing: border-box;
        }
        #fonts{
        font-family: 'Abel', sans-serif;
        }
        </style>
    </head>
    <body>
        <%
            if (session.getAttribute("User") == null) {
                response.sendRedirect("Login.jsp");
            }
        %>
        <% 
            String borrower=session.getAttribute("User").toString();
        %>
        <div class="toolbar">
            &nbsp;&nbsp;
            <a class="main" id="fonts"><strong>KNOWLEDGE  PLAZA</strong></a>
            <a class="clicks" title="ABOUT US" href="Home.jsp" target="_blank">HOME</a>
            <a class="clicks" title="BACK" href="Job.jsp" target="_self">BACK</a>
        %>
        <div class="toolbar">
            &nbsp;&nbsp;
            <a class="main" id="fonts"><strong>KNOWLEDGE  PLAZA</strong>/a>
        </div>

        <div class="head">Get In Touch With Lenders ?</div>
        <hr width="75%">
        <form method="POST" action="OrderServlet1">
        <table class="tabled" cellpadding = "9" cellspacing = "9">
            <thead class="thead">
            <tr>
                <th scope="col">Name</th>
                <th scope="col">Genre</th>
                <th scope="col">Lender's Name</th>
                <th scope="col">Contact Number</th>
                <th scope="col">Comments</th>
                <th scope="col">Pick</th>
            </tr>
            </thead>
            <c:forEach var="books" items="${books}"  >  
            <tr>
                <td><c:out value="${books.book}" /></td>
                <td><c:out value="${books.genre}" /></td>
                <td><c:out value="${books.lender}" /></td>
                <td><c:out value="${books.contactlender}" /></td>
                <td><c:out value="${books.comment}" /></td>                  
                <td><input type="checkbox" name="orders" value="${books.book}"></td>
                <input type="hidden" name="borrower" value="<%=borrower%>" />
            </tr>
            </c:forEach>
        </table>
        <input style="margin-left: 670px;margin-top: 30px;" type="submit" name="Submit">
        <input style="margin-left: 40px;" type="reset" name="Clear">    
        </form>    
    </body>
</html>
