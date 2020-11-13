package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--Login Page Of The Site-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login Page</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Login-style.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Abel\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"icon\" href=\"https://images.babytidings.com/images/11/1245355919393_38/img_large_watermarked.jpg\" type=\"image/gif\" sizes=\"16x16\">\n");
      out.write("        <style>\n");
      out.write("        html, body{\n");
      out.write("        height:100%;\n");
      out.write("        padding:0px;\n");
      out.write("        margin:0px;\n");
      out.write("        background-image: url(\"https://images.unsplash.com/photo-1522071820081-009f0129c71c?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=581511fae3d6e46d55eb0b6f3d86b69d&auto=format&fit=crop&w=1950&q=80\");\n");
      out.write("        }\n");
      out.write("        #fonts{\n");
      out.write("        font-family: 'Abel', sans-serif;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"toolbar\">\n");
      out.write("            &nbsp;&nbsp;\n");
      out.write("            <a class=\"main\" id=\"fonts\"><strong>KNOWLEDGE  PLAZA</strong></a>\n");
      out.write("            <a class=\"clicks\" title=\"CONTACT US\">CONTACT US</a>\n");
      out.write("            <a class=\"clicks\" title=\"ABOUT US\" href=\"Home.jsp\" target=\"_blank\">HOME</a>\n");
      out.write("        </div>\n");
      out.write("           \n");
      out.write("        <div class=\"forms\">\n");
      out.write("            <form action=\"LoginServlet1\" method=\"POST\"><br>\n");
      out.write("                <div id=\"heads\">LOGIN HERE</div><hr width=\"75%\"><br>\n");
      out.write("                <table class=\"tab\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter Name :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"username\" placeholder=\"Username\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter Password :</td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" placeholder=\"Password\"></td>\n");
      out.write("                </tr>   \n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" name=\"Login\"></td>\n");
      out.write("                    <td><input type=\"reset\" name=\"Clear\"></td>\n");
      out.write("                </tr>    \n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("                <a href=\"Register.jsp\" class=\"reg\"><i>Not Registered ?</i></a>\n");
      out.write("                <a href=\"AdminLogin.jsp\" class=\"reg\" style=\"color: red;\"><i>Admin Login</i></a>\n");
      out.write("            </form>\n");
      out.write("        </div>       \n");
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
