<%-- 
    Document   : Sell
    Author     : Chinmay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rent Your Stuff / Giveaway</title>
        <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
        <link rel="stylesheet" href="Sell-style.css">
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
        
        <script type="text/javascript">
            function validate()
            {
                if( document.myForm.bookname.value === "" )
                {
                    alert( "Please Enter Book Name!" );
                    document.myForm.bookname.focus() ;
                    return false;
                }
                
                if( document.myForm.genre.value === "none" )
                {
                    alert( "Please Enter Genre Of The Book!" );
                    document.myForm.genre.focus() ;
                    return false;
                }
                
                if( document.myForm.duration.value === "none" )
                {
                    alert( "Please Enter Rent Duration!" );
                    document.myForm.duration.focus() ;
                    return false;
                }
                
                if( document.myForm.pincode.value === "" )
                {
                    alert( "Please Enter Your Place Pincode!" );
                    document.myForm.pincode.focus() ;
                    return false;
                }
                
                if( document.myForm.comment.value === "" )
                {
                    alert( "Please Enter Your Comment!" );
                    document.myForm.comment.focus() ;
                    return false;
                }
                
                return true;
            }
        </script>    
    </head>
    <body>
        <%
            if(session.getAttribute("User")==null)
            {
                response.sendRedirect("Login.jsp");
            }
        %>
        <div class="toolbar">
            &nbsp;&nbsp;
            <a class="main" id="fonts"><strong>KNOWLEDGE  PLAZA</strong></a>
            <a class="clicks" title="ABOUT US" href="Home.jsp" target="_blank">HOME</a>
            <a class="clicks" title="BACK" href="Job.jsp" target="_self">BACK</a>
        </div>
        
        <div class="head">Subject To Content</div>
        <hr width="75%">
        <% 
            String lender=session.getAttribute("User").toString();
        %>
        <div class="front">
            <form name="myForm" action="SellServlet1" method="POST" onsubmit="return(validate());">
                <table class="contain">
                    <tr>
                        <td><input type="text" name="bookname" placeholder="Enter Name Of Book : " size="40"></td>
                    </tr>
                    <tr>
                        <td>
                        <div class="select-style">
                            <select name="genre">
                            <option value="none">--Enter The Genre Of Book--</option>
                            <option value="Mystery">Mystery</option>
                            <option value="Self Help">Self Help</option>
                            <option value="Academic">Academic</option>
                            <option value="Drama">Drama</option>
                        </select>
                        </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                        <div class="select-style">
                            <select name="duration">
                            <option value="none">--Enter The Duration Of Rent--</option>
                            <option value="1-Month">1-Month</option>
                            <option value="2-Month">2-Month</option>
                            <option value="Free-Giveaway!">Free-Giveaway!</option>  
                        </select>
                        </div>
                        </td>    
                    </tr>
                    <tr>
                        <td><input type="number" name="pincode" placeholder="Enter The Pincode Of Your Place : " size="40"></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="comment" placeholder="Any Comments : " size="100"></td>
                    </tr>
                    <input type="hidden" name="lender" value="<%=lender%>" />
                    <tr>
                        <td><input type="submit" name="Submit"></td
                    </tr>
                    <tr>
                        <td><input type="reset" name="Clear"></td>
                    </tr>
                </table>                
            </form>
        </div>
    </body>
</html>
