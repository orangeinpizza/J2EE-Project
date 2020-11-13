/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author Chinmay
 */
public class LoginDao {
    
    public boolean checkLogin (Customer s){
        
        String pName="Chinmay";
        String pPass="123";
        return (s.getUserName().equals(pName) && s.getPassWord().equals(pPass));
    }
}