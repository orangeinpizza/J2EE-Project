/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Customer {
    private String userName;
    private String passWord;
    private String eMail;
    private String address;
    private String phone;
    
    public String getUserName(){
        return userName;
    }
 
    public void setUserName(String userName){
        this.userName= userName;
    }   

    public String getPassWord(){
        return passWord;
    }
    
    public void setPassWord(String passWord){
        this.passWord= passWord;
    } 
    
    public String geteMail(){
        return eMail;
    }
    
    public void seteMail(String eMail){
        this.eMail=eMail;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address=address;
    }
    
    public String getPhone(){
        return phone;
    }
 
    public void setPhone(String phone){
        this.phone= phone;
    }
}
