package edu.bu.met.cs665.Emails;

import edu.bu.met.cs665.Customers.*;
public interface EmailFactory {
  BusinessCustomer createBusinessCustomer(String name);
  
  ReturningCustomer createReturningCustomer(String name);
  
  FrequentCustomer createFrequentCustomer(String name);
  
  NewCustomer createNewCustomer(String name);
  
  VipCustomer createVipCustomer(String name);
}
