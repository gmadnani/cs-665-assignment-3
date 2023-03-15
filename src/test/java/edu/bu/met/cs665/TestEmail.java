package edu.bu.met.cs665;

import edu.bu.met.cs665.customers.BusinessCustomer;
import edu.bu.met.cs665.customers.Customer;
import edu.bu.met.cs665.customers.FrequentCustomer;
import edu.bu.met.cs665.customers.NewCustomer;
import edu.bu.met.cs665.customers.ReturningCustomer;
import edu.bu.met.cs665.customers.VipCustomer;
import org.junit.Assert;
import org.junit.Test;
public class TestEmail {
  @Test
  public void testBusinessCustomer() {
    Customer customer = new BusinessCustomer("Girish Co.");
    String email = customer.getEmailText();
    Assert.assertEquals("Dear Girish Co.,\nThank you for your recent purchase." +
        " As a valued business customer, we would like to offer you 10% off your next purchase.", email);
  }
  
  @Test
  public void testReturningCustomer() {
    Customer customer = new ReturningCustomer("Girish");
    String email = customer.getEmailText();
    Assert.assertEquals("Dear Girish,\nThank you for your recent purchase. " +
        "Its been a while since your last purchase, as a returning customer, " +
        "we would like to offer you 10% off your next purchase.", email);
  }
  
  @Test
  public void testFrequentCustomer() {
    Customer customer = new FrequentCustomer("Girish");
    String email = customer.getEmailText();
    Assert.assertEquals("Dear Girish,\nThank you for your recent purchase. " +
        "Thank you for being a loyal customer to us, as a frequent customer, " +
        "we would like to offer you 10% off your next purchase.", email);
  }
  
  @Test
  public void testNewCustomer() {
    Customer customer = new NewCustomer("Girish");
    String email = customer.getEmailText();
    Assert.assertEquals("Dear Girish,\nThank you for your recent purchase. As a new customer, " +
        "we would like to offer you 10% off your next purchase.", email);
  }
  
  @Test
  public void testVipCustomer() {
    Customer customer = new VipCustomer("Girish");
    String email = customer.getEmailText();
    Assert.assertEquals("Dear Girish,\nThank you for your recent purchase. " +
        "As our VIP customer, we will be sending a gift as our token of appreciation with this order.", email);
  }
  
}
