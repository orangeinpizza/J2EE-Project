/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chinmay
 */
public class CustomerMasterDAO1 extends BaseDAO {
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    int i;

    public int createAccount(Customer c) throws SQLException {
        //Step 1: Add derby.jar,derbyclient.jar and derbynet.jar to library on lhs
        con = getConnection();      //Step 2: get-Connection from base-dao
        String sql = "insert into CHINMAY.REGISTER values(?,?,?,?,?)";     //Step 3 : Make sql query
        
        try {
            ps = con.prepareStatement(sql);      //Step 4 : Prepared Statement
            ps.setString(1, c.getUserName());
            ps.setString(2, c.getPassWord());
            ps.setString(3, c.geteMail());
            ps.setString(4, c.getAddress());
            ps.setString(5, c.getPhone());
        
            i = ps.executeUpdate();    //Step 5 : Fire the queries
            if (i > 0) {
                System.out.println("Successful insertion");    //Step 6 : Process result & also in registercustomerservlet
            } else {
                System.out.println("Insertion failed");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {                       //Step 7 : Close the connections
                con.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return i;
        
    }
    
    public int saveFeedback(Feedback f) throws SQLException{
        //Step 1: Add derby.jar,derbyclient.jar and derbynet.jar to library on lhs
        con = getConnection();      //Step 2: get-Connection from base-dao
        String sql = "insert into CHINMAY.FEEDBACK values(?,?)";     //Step 3 : Make sql query
        try {
            ps = con.prepareStatement(sql);      //Step 4 : Prepared Statement
            ps.setString(1, f.getName());
            ps.setString(2, f.getFeedback());
            i = ps.executeUpdate();    //Step 5 : Fire the queries
            if (i > 0) {
                System.out.println("Feedback saved.");    //Step 6 : Process result & also in registercustomerservlet
            } else {
                System.out.println("Feedback not saved.");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            
            try {                       //Step 7 : Close the connections
                con.close();
                ps.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return i;
    }   

    public List viewAllCustomers(){
          List<Customer> list = new ArrayList();
          
          try {
            con=getConnection();
        
          String sql = "select * from feedback";
          ps = con.prepareStatement(sql);
          rs = ps.executeQuery();
          while(rs.next()){
              Customer c = new Customer();
              c.setUserName(rs.getString(1));
              c.setPassWord(rs.getString(2));
              c.seteMail(rs.getString(3));
              c.setAddress(rs.getString(4));
              c.setPhone(rs.getString(5));
              list.add(c);
              
              
          }
          }
          catch(SQLException ex){
              Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
          }
           try {
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
        }
           return list;
      }

public int checkLogin(Customer c)
{
    con=getConnection();
    String sql = "select * from CHINMAY.REGISTER where USERNAME=? AND PASSWORD=?";
 
    try {
            ps = con.prepareStatement(sql);
            ps.setString(1,c.getUserName());
            ps.setString(2,c.getPassWord());
            
            rs=ps.executeQuery();
                
            while(rs.next())
            {
                return 1;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ps.close();
            con.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    } 

    public String findPhone(String name)
    {    
        con = getConnection(); // get connection
        String sql="select * from CHINMAY.REGISTER where USERNAME=?"; // form
        String phone = null;
        
        try {
            
        ps=con.prepareStatement(sql); // prepare
        ps.setString(1,name);
        rs=ps.executeQuery(); // execute  -> returns result set
        while(rs.next())
        {   
            System.out.println("Got The Phone No!");
            phone=rs.getString(5);     
        }
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ps.close();
            con.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return phone;
    }
    
    public int makeDonation(Donor d)
    {
        //Step 1: Add derby.jar,derbyclient.jar and derbynet.jar to library on lhs
        
        con = getConnection();      //Step 2: get-Connection from base-dao
        String sql = "insert into CHINMAY.FUND values(?,?,?,?,?)";     //Step 3 : Make sql query
        
        try {
            ps = con.prepareStatement(sql);      //Step 4 : Prepared Statement
            ps.setString(1, d.getDonor());
            ps.setDouble(2, d.getAmount());
            ps.setString(3, d.getAccountno());
            ps.setString(4, d.getBank());
            ps.setDate(5, (Date) d.getDate());
        
            i = ps.executeUpdate();    //Step 5 : Fire the queries
            if (i > 0) {
                System.out.println("Successful insertion");    //Step 6 : Process result & also in registercustomerservlet
            } else {
                System.out.println("Insertion failed");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {                       //Step 7 : Close the connections
                con.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return i;
    }
}

