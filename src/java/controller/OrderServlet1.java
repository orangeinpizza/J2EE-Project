/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ProductMasterDAO1;

/**
 *
 * @author Chinmay
 */
public class OrderServlet1 extends HttpServlet {

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
            ProductMasterDAO1 pmd =new ProductMasterDAO1();
            HttpSession session = request.getSession(true);
            String order []= request.getParameterValues("orders");
            String borrower = request.getParameter("borrower");
            
            int i;
            int count=0;
            int result;
            for(i=0;i<order.length;i++)
            {
                result=pmd.makeTransaction(order[i],borrower);
                count+=pmd.removeBook(order[i]);
                System.out.println("Order Number : "+(i+1)+" Done :"+result);
            }
            if(count==order.length){
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Order Placed!');");
                out.println("location='BuySuccess.jsp';");
                out.println("</script>");
            }
            else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Problem!');");
                out.println("location='Buy.jsp';");
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
