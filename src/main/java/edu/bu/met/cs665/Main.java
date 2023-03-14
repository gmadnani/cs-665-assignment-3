/**
 * Name: FIRST_NAME LAST_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: MM/DD/YYYY
 * File Name: Main.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.Customers.Customer;
import edu.bu.met.cs665.Emails.EmailFactory;
import edu.bu.met.cs665.Emails.EmailsFactory;
public class Main {
  
  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    Main m = new Main();
    EmailFactory emailFactory = new EmailsFactory();
    
    Customer businessCustomer = emailFactory.createBusinessCustomer("Giri Co.");
    System.out.println(businessCustomer.getEmailText());
    
    Customer returningCustomer = emailFactory.createReturningCustomer("Giri");
    System.out.println(returningCustomer.getEmailText());
    
    Customer frequentCustomer = emailFactory.createFrequentCustomer("Girish");
    System.out.println(frequentCustomer.getEmailText());
    
    Customer newCustomer = emailFactory.createNewCustomer("Girish Madnani");
    System.out.println(newCustomer.getEmailText());
    
    Customer vipCustomer = emailFactory.createVipCustomer("Girish Mohan Madnani");
    System.out.println(vipCustomer.getEmailText());
  }
  
}
