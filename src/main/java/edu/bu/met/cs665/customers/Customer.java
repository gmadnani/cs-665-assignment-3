package edu.bu.met.cs665.customers;

public abstract class Customer {
  protected String name;
  
  public Customer(String name) {
    this.name = name;
  }
  
  public abstract String getEmailText();
}
