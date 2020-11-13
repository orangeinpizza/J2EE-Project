/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.CustomerMasterDAO1;
import model.Donor;

/**
 *
 * @author Chinmay
 */
public class DonateServlet1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.text.ParseException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String donor=request.getParameter("donor");
            Double amount=Double.valueOf(request.getParameter("amount"));
            String bank=request.getParameter("bank");
            String account=request.getParameter("accountno");
//            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//            Date today = new Date();
//            Date todayWithZeroTime = formatter.parse(formatter.format(today));

            java.util.Calendar cal = Calendar.getInstance();
            java.util.Date utilDate = new java.util.Date(); // your util date
            cal.setTime(utilDate);
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            java.sql.Date sqlDate = new java.sql.Date(cal.getTime().getTime()); // your sql date

            Donor d=new Donor();
            d.setDonor(donor);
            d.setAmount(amount);
            d.setBank(bank);
            d.setAccountno(account);
            d.setDate(sqlDate);
            CustomerMasterDAO1 cmd= new CustomerMasterDAO1();
            int i;
            i=cmd.makeDonation(d);
            if(i>0){
                System.out.println("Donation Made! "+amount);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Donation Succesful!');");
                out.println("location='Job.jsp';");
                out.println("</script>");
            }
            else{
                System.out.println("Donation Unsuccesful!");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Donation Unsuccesful!');");
                out.println("location='Donation.jsp';");
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(DonateServlet1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(DonateServlet1.class.getName()).log(Level.SEVERE, null, ex);
        }
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
