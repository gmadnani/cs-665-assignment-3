package edu.bu.met.cs665.customers;

public class VipCustomer extends Customer {
  
  public VipCustomer(String name) {
    super(name);
  }
  
  @Override
  public String getEmailText() {
    return String.format("Dear %s,\n"
        + "Thank you for your recent purchase. As our VIP customer, "
        + "we will be sending a gift as our token "
        + "of appreciation with this order.", name);
  }
}
