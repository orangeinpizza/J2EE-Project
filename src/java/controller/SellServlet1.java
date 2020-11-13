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
import model.Book;
import model.ProductMasterDAO1;

/**
 *
 * @author Chinmay
 */
public class SellServlet1 extends HttpServlet {

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
            String name = request.getParameter("bookname");
            String genre = request.getParameter("genre");
            String duration = request.getParameter("duration");
            String pincode = request.getParameter("pincode");
            String comment=request.getParameter("comment");
            String lender=request.getParameter("lender");
            
            Book b=new Book();
            b.setBook(name);
            b.setGenre(genre);
            b.setDuration(duration);
            b.setPincode(pincode);
            b.setComment(comment);
            b.setLender(lender); 
            
            
            ProductMasterDAO1 pmd=new ProductMasterDAO1();
            int r=pmd.createBook(b);
            if(r>0)
            {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Form Saved.');");
                out.println("location='SellSuccess.jsp';");
                out.println("</script>");
            }
            else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Retry!.');");
                out.println("location='Sell.jsp';");
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
