package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Administration Login</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Abel\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Sell-style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Buy-style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Login-style.css\">\n");
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
      out.write("    <body>\n");
      out.write("        ");

            if(session.getAttribute("User")==null)
            {
                response.sendRedirect("AdminLogin.jsp");
            }
        
      out.write("\n");
      out.write("        <div class=\"toolbar\">\n");
      out.write("            &nbsp;&nbsp;\n");
      out.write("            <a class=\"main\" id=\"fonts\"><strong>KNOWLEDGE  PLAZA</strong></a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"adminsection\">\n");
      out.write("            <div class=\"head\" style=\"color: black;\">ADMIN SECTION</div>\n");
      out.write("            <hr width=\"75%\">\n");
      out.write("            <p class=\"head\" style=\"color: black;font-size: 26px;\">Here, you can view and delete any material of your choice. And can make changes as per required by you.</p>\n");
      out.write("            <a href=\"AdminServlet2?page=try\" style=\"text-decoration: underline;color: black;\">View Books.</a>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"height: 30px;margin-left: 700px;\">\n");
      out.write("            <form action=\"Logout\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" value=\"Logout\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
