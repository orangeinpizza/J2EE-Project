package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--The Home Site-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Knowledge Plaza : Nourishing Future.</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Abel\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Home-style.css\">\n");
      out.write("        <link rel=\"icon\" href=\"https://images.babytidings.com/images/11/1245355919393_38/img_large_watermarked.jpg\" type=\"image/gif\" sizes=\"16x16\">\n");
      out.write("        <style>\n");
      out.write("        html, body{\n");
      out.write("        height:100%;\n");
      out.write("        padding:0px;\n");
      out.write("        margin:0px;\n");
      out.write("        background-color: whitesmoke;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        #fonts{\n");
      out.write("        font-family: 'Abel', sans-serif;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"toolbar\">\n");
      out.write("            &nbsp;&nbsp;\n");
      out.write("            <a class=\"main\" id=\"fonts\"><strong>KNOWLEDGE  PLAZA</strong></a>\n");
      out.write("            <a class=\"clicks\" title=\"LOGIN\" href=\"Login.jsp\" target=\"_blank\">LOGIN</a>\n");
      out.write("            <a class=\"clicks\" title=\"CONTACT US\" href=\"Contact.jsp\" target=\"_blank\">REACH US & DONATE</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            <img src=\"http://www.jackizehner.com/wp-content/uploads/2017/03/remote-site-solutions-bg_ngo-sector.jpg\" alt=\"Students\" height=600px\" width=\"100%\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"height:1450px;width: 100%;\">\n");
      out.write("            <h1 style=\"text-align: center;font-size: 35px;font-family: Candara;color: #75787c\">Who Are We ?</h1><hr width=\"75%\">\n");
      out.write("            <p style=\"text-align: left;font-size: 30px;padding-left: 70px;padding-right: 35px;font-family: Candara;\">\n");
      out.write("                <strong>Knowledge Plaza</strong> is been a boon to the students who are belonging to Financial Condition and cannot afford get School materials like Uniform, Books, \n");
      out.write("                and various other stuff related to academic and social life.<br><br>\n");
      out.write("                The Organization is working since last 10 years and has opened many centers for helping people of various communities.<br>\n");
      out.write("                Many students have been benefited by the sincere and hard-work of our Organization.<br>    \n");
      out.write("            </p>\n");
      out.write("            <h1 style=\"text-align: center;font-size: 35px;font-family: Candara;color: #75787c\">Motto</h1><hr width=\"75%\">\n");
      out.write("            <p style=\"text-align: left;font-size: 30px;padding-left: 70px;padding-right: 35px;font-family: Candara;\">\n");
      out.write("                In last 10 years, our Organization has taken help from many charities and encouraging many people in our societies to generate as much help as possible.<br>\n");
      out.write("                People have been donating funds, their previous used items and through our extra effort its been possible for the needy to meet its requirements.<br>\n");
      out.write("                Helping out people in our society is a <b>tough job</b> and we believe that it can be done.<br>\n");
      out.write("            </p>    \n");
      out.write("            <p style=\"text-align: left;font-size: 35px;padding-left: 50px;padding-right: 35px;font-family: Candara;\"><b><em>'Together possible'.</em></b></p>\n");
      out.write("            <h1 style=\"text-align: center;font-size: 35px;font-family: Candara;color: #75787c\">How We Work ?</h1><hr width=\"75%\">\n");
      out.write("            <p style=\"text-align: left;font-size: 30px;padding-left: 70px;padding-right: 35px;font-family: Candara;\">\n");
      out.write("                There has been a boost in the demand of schooling and other accessories for low-cost and we are taking measures for competing with the demand.<br>\n");
      out.write("                From the funds which are been donated to us, we accumulate it and buy stuff in large stocks and sell it in lesser prices as much as possible.\n");
      out.write("                <br><br>\n");
      out.write("            </p>\n");
      out.write("            \n");
      out.write("            <h1 style=\"text-align: center;font-size: 35px;font-family: Candara;color: #75787c\">Shop - Donate</h1><hr width=\"75%\">\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"column\">\n");
      out.write("                    <img src=\"http://blogs.lse.ac.uk/lsereviewofbooks/files/2016/02/Books-for-Survey.jpg\" alt=\"Books\" style=\"width:350px; height:270px;\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"column\">\n");
      out.write("                    <img src=\"https://www.dhresource.com/0x0s/f2-albu-g5-M00-A7-E9-rBVaJFkdEiuANwBqAALq6XYXgQI490.jpg/fashion-classic-backpack-pvc-rivets-handbags.jpg\" alt=\"Books\" style=\"width:350px; height:270px;\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"column\">\n");
      out.write("                    <img src=\"https://www.rd.com/wp-content/uploads/2018/03/money-tricks-760x506.jpg\" alt=\"Books\" style=\"width:350px; height:270px;\">\n");
      out.write("                </div>    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <p style=\"text-align: left;font-size: 30px;padding-left: 70px;padding-right: 35px;font-family: Candara;\">\n");
      out.write("            Here we are selling the accessories in low, discounted price. Customers interested are required to open a account and Shop from our diverse collection of items.<br>\n");
      out.write("            Anyone interested in making a 'Donation' is always welcome, they are suppose to fill form to make a donation.\n");
      out.write("            <br><br>\n");
      out.write("        </p>\n");
      out.write("        \n");
      out.write("        <div class=\"bottbar\">\n");
      out.write("            &nbsp;&nbsp;\n");
      out.write("            <b id=\"under\">Knowledge Plaza</b><br><br>&nbsp;&nbsp;\n");
      out.write("            501 - Sunshine Tower<br>&nbsp;&nbsp;\n");
      out.write("            Ranade Road, Near Shivaji Park,<br>&nbsp;&nbsp;\n");
      out.write("            Dadar, Mumbai 400028<br><br>&nbsp;&nbsp;\n");
      out.write("            &COPY; 2018 KNOWLEDGE PLAZA\n");
      out.write("            <br><br>    \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
