/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
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
public class ProductMasterDAO1 extends BaseDAO {
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    int i;
    
    
    public int createBook(Book b){
        con = getConnection();      //Step 2: get-Connection from base-dao
        String sql = "insert into CHINMAY.BOOK values(?,?,?,?,?,?)";     //Step 3 : Make sql query
        try {
            ps = con.prepareStatement(sql);      //Step 4 : Prepared Statement
            ps.setString(1, b.getBook());
            ps.setString(2, b.getGenre());
            ps.setString(3, b.getDuration());
            ps.setString(4, b.getPincode());
            ps.setString(5, b.getComment());
            ps.setString(6, b.getLender());
            i = ps.executeUpdate();    //Step 5 : Fire the queries
            if (i > 0) {
                System.out.println("Book saved.");    //Step 6 : Process result & also in registercustomerservlet
            } else {
                System.out.println("Book not saved.");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(ProductMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            
            try {                       //Step 7 : Close the connections
                con.close();
                ps.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(ProductMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return i;
    }
    
    public List viewAllProducts(){
          
    List<Book> list = new ArrayList<>();
          
    try {      
    con=getConnection();
    String sql = "select * from CHINMAY.BOOK";
    ps = con.prepareStatement(sql);
    rs = ps.executeQuery();
    while(rs.next()){
              
        Book b = new Book();
        b.setBook(rs.getString(1));
        b.setGenre(rs.getString(2));
        b.setDuration(rs.getString(3));
        b.setPincode(rs.getString(4));
        b.setComment(rs.getString(5));
        b.setLender(rs.getString(6));
        list.add(b);      
        }
    }
    catch(SQLException ex){
        Logger.getLogger(ProductMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        ps.close();
        con.close();
    } 
    catch (SQLException ex) {
        Logger.getLogger(ProductMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        return list;
    }
    
    
    public Book findBook(String bname)
    {    
        CustomerMasterDAO1 cmd=new CustomerMasterDAO1();
        con = getConnection(); // get connection
        String sql="select * from CHINMAY.BOOK where NAME=?"; // form
        Book b=new Book();
        try {
            
        ps=con.prepareStatement(sql); // prepare
        ps.setString(1,bname);
        rs=ps.executeQuery(); // execute  -> returns result set
        while(rs.next())
        {   
            System.out.println("test");
            b.setBook(rs.getString(1));
            b.setGenre(rs.getString(2));
            b.setDuration(rs.getString(3));
            b.setPincode(rs.getString(4));
            b.setComment(rs.getString(5));
            b.setLender(rs.getString(6));
            b.setContactlender(cmd.findPhone(b.getLender())); 
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
        return b;
    }
    
    public int removeBook(String bname) {
        
        int count=0;
        con = getConnection(); // get the connection
        String sql = "delete from CHINMAY.BOOK where NAME=?"; // form the sql 
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, bname); // prepare sql
            count = ps.executeUpdate();
            if (count > 0)
            {
                System.out.println("Book Successfully Deleted");
            } 
            else {
                System.out.println("Book Deletion Failed");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try 
        {
            ps.close();
            con.close();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(CustomerMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }
    
    public int makeTransaction(String book, String borrower){
        
        Book b=new Book();
        b=findBook(book);
        CustomerMasterDAO1 cmd=new CustomerMasterDAO1();
        con = getConnection();      //Step 2: get-Connection from base-dao
        String sql = "insert into CHINMAY.TRANS values(?,?,?,?,?)";     //Step 3 : Make sql query
       
        try {
            ps = con.prepareStatement(sql);      //Step 4 : Prepared Statement
            ps.setString(1, b.getLender());
            ps.setString(2, borrower);
            ps.setString(3, book);
            ps.setString(4, b.getContactlender());
            ps.setString(5, cmd.findPhone(borrower));
            i = ps.executeUpdate();    //Step 5 : Fire the queries
            if (i > 0) {
                System.out.println("Transaction Successfull.");    //Step 6 : Process result & also in registercustomerservlet
            } else {
                System.out.println("Transaction Unsuccessfull.");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(ProductMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            
            try {                       //Step 7 : Close the connections
                con.close();
                ps.close();
            } 
            catch (SQLException ex) {
                Logger.getLogger(ProductMasterDAO1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return i;
    }
    
    }