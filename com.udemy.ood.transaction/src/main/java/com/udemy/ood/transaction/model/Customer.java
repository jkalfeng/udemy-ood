package com.udemy.ood.transaction.model;

public class Customer {

   private String name;
   private Double balance;

   public String getName() {
      return name;
   }

   public void pay(Double amount) {
      balance -= amount;
   }
}
