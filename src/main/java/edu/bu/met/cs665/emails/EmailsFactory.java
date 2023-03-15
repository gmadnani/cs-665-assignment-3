package edu.bu.met.cs665.emails;

import edu.bu.met.cs665.customers.BusinessCustomer;
import edu.bu.met.cs665.customers.FrequentCustomer;
import edu.bu.met.cs665.customers.NewCustomer;
import edu.bu.met.cs665.customers.ReturningCustomer;
import edu.bu.met.cs665.customers.VipCustomer;

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
