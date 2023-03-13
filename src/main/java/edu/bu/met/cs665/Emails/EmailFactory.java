package edu.bu.met.cs665.Emails;

import edu.bu.met.cs665.Customers.BusinessCustomer;
public interface EmailFactory {
  BusinessCustomer createBusinessCustomer(String name);
}
