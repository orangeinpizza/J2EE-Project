/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;
import model.CustomerMasterDAO1;


/**
 *
 * @author Chinmay
 */
public class LoginServlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
 
            CustomerMasterDAO1 cmd = new CustomerMasterDAO1();
            int b;
            
            Customer c=new Customer();
            c.setUserName(request.getParameter("username"));
            c.setPassWord(request.getParameter("password"));

            b = cmd.checkLogin(c);
            if(b>0)
            {
                /*
                request.setAttribute("customer",c);
                RequestDispatcher rd;
                rd = request.getRequestDispatcher("Job.jsp");
                rd.forward(request, response);
                HttpSession session=request.getSession();  
                session.setAttribute("User",c.getUserName()); 
                <jsp:useBean id="customer" class="model.Customer" scope="request"/> <jsp:getProperty name="customer" property="userName"/>!
                */
                HttpSession session=request.getSession();
                session.setAttribute("User",c.getUserName());
                response.sendRedirect("Job.jsp");
            }                
            else
            {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Login Credentials Are Invalid. Please Try Again.');");
                out.println("location='Login.jsp';");
                out.println("</script>");
            }                    
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
/*


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="model.Customer"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@include file="header.jsp" %>
        <br />
        
        Welcome
        <jsp:useBean id="customer" class="model.Customer" scope="request"/>
            
            <jsp:getProperty name="customer" property="email"/>
        <br />
            
        <jsp:include page="footer.jsp">
            <jsp:param name="subTitle" value="Computer department"/>
        </jsp:include>              
     </body>
</html>

*/