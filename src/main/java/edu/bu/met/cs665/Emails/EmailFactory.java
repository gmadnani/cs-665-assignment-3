package edu.bu.met.cs665.Emails;

import edu.bu.met.cs665.Customers.BusinessCustomer;
import edu.bu.met.cs665.Customers.FrequentCustomer;
import edu.bu.met.cs665.Customers.NewCustomer;
import edu.bu.met.cs665.Customers.ReturningCustomer;
public interface EmailFactory {
  BusinessCustomer createBusinessCustomer(String name);
  
  ReturningCustomer createReturningCustomer(String name);
  
  FrequentCustomer createFrequentCustomer(String name);
  
  NewCustomer createNewCustomer(String name);
}
