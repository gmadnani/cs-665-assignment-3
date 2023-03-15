package edu.bu.met.cs665.customers;

public class FrequentCustomer extends Customer {
  
  public FrequentCustomer(String name) {
    super(name);
  }
  
  @Override
  public String getEmailText() {
    return String.format("Dear %s,\n"
        + "Thank you for your recent purchase. "
        + "Thank you for being a loyal customer to us, as a frequent customer, "
        + "we would like to offer you 10%% off your next purchase.", name);
  }
}
