package edu.bu.met.cs665.customers;

public class BusinessCustomer extends Customer {
  
  public BusinessCustomer(String name) {
    super(name);
  }
  
  @Override
  public String getEmailText() {
    return String.format("Dear %s,\n"
        + "Thank you for your recent purchase. As a valued business customer, "
        + "we would like to offer you 10%% off your next purchase.", name);
  }
}
