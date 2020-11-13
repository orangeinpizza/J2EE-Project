/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import com.teknikindustries.bulksms.SMS;
/**
 *
 * @author Chinmay
 */
public class Message {
    public static void main(String[] args) {
        SMS sms = new SMS();
        sms.SendSMS("Chinmay9", "bxvaixiZ8WSswLd", "Hello", "9930467299", "https://bulksms.vsms.net/eapi/submission/send_sms/2/2.0");
    }
}
