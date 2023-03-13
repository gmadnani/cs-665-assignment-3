package edu.bu.met.cs665.Emails;

import edu.bu.met.cs665.Customers.BusinessCustomer;
public class EmailsFactory implements EmailFactory {
  public BusinessCustomer createBusinessCustomer(String name) {
    return new BusinessCustomer(name);
  }
}
