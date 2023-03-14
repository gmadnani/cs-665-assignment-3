package edu.bu.met.cs665.Customers;

public class NewCustomer extends Customer {
  
  public NewCustomer(String name) {
    super(name);
  }
  
  @Override
  public String getEmailText() {
    return String.format("Dear %s,\n" +
        "Thank you for your recent purchase. As a new customer, " +
        "we would like to offer you 10%% off your next purchase.", name);
  }
}
