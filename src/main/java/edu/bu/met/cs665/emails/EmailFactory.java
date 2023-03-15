package edu.bu.met.cs665.emails;

import edu.bu.met.cs665.customers.BusinessCustomer;
import edu.bu.met.cs665.customers.FrequentCustomer;
import edu.bu.met.cs665.customers.NewCustomer;
import edu.bu.met.cs665.customers.ReturningCustomer;
import edu.bu.met.cs665.customers.VipCustomer;

public interface EmailFactory {
  BusinessCustomer createBusinessCustomer(String name);
  
  ReturningCustomer createReturningCustomer(String name);
  
  FrequentCustomer createFrequentCustomer(String name);
  
  NewCustomer createNewCustomer(String name);
  
  VipCustomer createVipCustomer(String name);
}
