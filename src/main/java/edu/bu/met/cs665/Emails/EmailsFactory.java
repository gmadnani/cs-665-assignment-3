package edu.bu.met.cs665.Emails;

import edu.bu.met.cs665.Customers.BusinessCustomer;
import edu.bu.met.cs665.Customers.ReturningCustomer;
public class EmailsFactory implements EmailFactory {
  public BusinessCustomer createBusinessCustomer(String name) {
    return new BusinessCustomer(name);
  }
  
  public ReturningCustomer createReturningCustomer(String name) {
    return new ReturningCustomer(name);
  }
}
