package edu.bu.met.cs665.Emails;

import edu.bu.met.cs665.Customers.*;
public class EmailsFactory implements EmailFactory {
  public BusinessCustomer createBusinessCustomer(String name) {
    return new BusinessCustomer(name);
  }
  
  public ReturningCustomer createReturningCustomer(String name) {
    return new ReturningCustomer(name);
  }
  
  public FrequentCustomer createFrequentCustomer(String name) {
    return new FrequentCustomer(name);
  }
  
  public NewCustomer createNewCustomer(String name) {
    return new NewCustomer(name);
  }
  
  public VipCustomer createVipCustomer(String name) {
    return new VipCustomer(name);
  }
}
