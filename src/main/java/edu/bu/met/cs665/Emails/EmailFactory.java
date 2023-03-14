package edu.bu.met.cs665.Emails;

import edu.bu.met.cs665.Customers.BusinessCustomer;
import edu.bu.met.cs665.Customers.ReturningCustomer;
public interface EmailFactory {
  BusinessCustomer createBusinessCustomer(String name);
  
  ReturningCustomer createReturningCustomer(String name);
}
