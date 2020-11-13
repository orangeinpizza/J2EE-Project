<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Reach Us & Donate</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://fonts.googleapis.com/css?family=Abel" rel="stylesheet">
        <link rel="stylesheet" href="Contact-style.css">
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
        <div class="toolbar">
            &nbsp;&nbsp;
            <a class="main" id="fonts"><strong>KNOWLEDGE  PLAZA</strong></a>
            <a class="clicks" title="LOGIN" href="Login.jsp" target="_blank">LOGIN</a>
            <a class="clicks" title="ABOUT US" href="Home.jsp" target="_blank">HOME</a>
        </div>
        
        <div class="heading">
            HOW TO REACH<hr width="75%">
        </div>
        
        <div id="map"></div>
        <script>
            function initMap(){
                var location={lat:19.021537,lng:72.839498};
                var map=new google.maps.Map(document.getElementById("map"),{zoom:20,center:location});
                var marker=new google.maps.Marker({position:location,map:map});
            }
        </script>
        <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBxtrm9cUzmpIAbT3_ODoxvhcd1ZXoCL0U&callback=initMap" type="text/javascript"></script>     
        <br>
        
        <div class="heading">
            CONTACT US<hr width="75%">
        </div>
        
        
            <p id="add">
            <b style="font-size: 35px">ADDRESS : </b> 501, Sunshine Tower, Ranade Road, Dadar, Mumbai, 400028<br>
            <b style="font-size: 35px">PHONE NO : </b> +91 987543202, +91 976589032<br>
            <b style="font-size: 35px">FAX NO : </b> 022-5431-09<br>
            <b style="font-size: 35px">EMAIL ID : </b> knowledgeplaza@gmail.com
            </p>
        
        
            <div class="heading">
                FEEDBACK<hr width="75%">
            </div>
            <p class="feedtext">
                We <i>'Appreciate'</i> any kind of feedback from you people. And if any development / innovation is required from our side, we fill be there for it.  
            </p>
            <form action="ContactServlet1" method="POST" class="form">      
                <input type="text" name="visitor" placeholder="Enter Your Name" size="40">
                <textarea style="font-size:30px;" type="bigtext" name="feedback" placeholder="Enter Your Feedback Here" rows="8" cols="65"></textarea>
                <p><input type="submit" name="Submit"</p>
            </form>
        
       
        <br><br>
        
        
        <div class="bottbar">
            &nbsp;&nbsp;<b id="under">Knowledge Plaza</b><br><br>
            &nbsp;&nbsp;501 - Sunshine Tower<br>
            &nbsp;&nbsp;Ranade Road, Near Shivaji Park,<br>
            &nbsp;&nbsp;Dadar, Mumbai 400028<br><br>
            &nbsp;&nbsp;&COPY; 2018 KNOWLEDGE PLAZA
            <br><br>    
        </div>       
        
       
    </body>
</html>
