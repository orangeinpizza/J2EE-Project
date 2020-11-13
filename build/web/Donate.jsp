<%-- 
    Document   : Donate
    Author     : Chinmay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donate Funds</title>
        <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
        <link rel="stylesheet" href="Job-style.css">
        <link rel="stylesheet" href="Donate-style.css">
        <link rel="stylesheet" href="Sell-style.css">
        <link rel="icon" href="https://images.babytidings.com/images/11/1245355919393_38/img_large_watermarked.jpg" type="image/gif" sizes="16x16">
        <style>
        html, body{
        height:100%;
        padding:0px;
        margin:0px;
        background-image: url("https://www.msatrust.org.uk/wp-content/uploads/2016/02/donation-product.png");
        box-sizing: border-box;
        }
        #fonts{
        font-family: 'Abel', sans-serif;
        }
        </style>
        
        <script type="text/javascript">
            function validate()
            {
                if( document.myForm.donor.value === "" )
                {
                    alert( "Please Enter Donor's Name!" );
                    document.myForm.donor.focus() ;
                    return false;
                }
                
                if( document.myForm.amount.value === "" )
                {
                    alert( "Please Enter Amount Of Donation!" );
                    document.myForm.amount.focus() ;
                    return false;
                }
                
                if( document.myForm.bank.value === "" )
                {
                    alert( "Please Enter Bank Name!" );
                    document.myForm.bank.focus() ;
                    return false;
                }
                
                if( document.myForm.accountno.value === "" )
                {
                    alert( "Please Enter Your Account Number!" );
                    document.myForm.accountno.focus() ;
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
        
        <div class="fill">
            <div style="font-size: 30px;padding-top: 20px;font-family: Candara;">Donate</div>
            <hr width="75%">
            <form name="myForm" action="DonateServlet1" method="POST" onsubmit="return(validate());">
                <table class="indent">
                    <tr>
                        <td><input type="text" name="donor" placeholder="Enter Name Of Donor : " size="40"></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="amount" placeholder="Enter Amount : " size="40"></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="bank" placeholder="Enter Bank : " size="40"></td>
                    </tr>
                    <tr>
                        <td><input type="text" name="accountno" placeholder="Enter Account No : " size="40"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="Submit"></td
                    </tr>
                    <tr>
                        <td><input type="reset" name="Clear"></td>
                    </tr>
                </table>                
            </form>
            <p style="color:white;">*Please Enter Your Correct Information.</p>
        </div>
    </body>
</html>
