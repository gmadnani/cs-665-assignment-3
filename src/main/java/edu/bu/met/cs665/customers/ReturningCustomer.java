package edu.bu.met.cs665.customers;

public class ReturningCustomer extends Customer {
  
  public ReturningCustomer(String name) {
    super(name);
  }
  
  @Override
  public String getEmailText() {
    return String.format("Dear %s,\n"
        + "Thank you for your recent purchase. "
        + "Its been a while since your last purchase, as a returning customer, "
        + "we would like to offer you 10%% off your next purchase.", name);
  }
}
