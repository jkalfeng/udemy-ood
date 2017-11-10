package com.udemy.ood.transaction.impl;

import com.udemy.ood.transaction.common.Accounting;
import com.udemy.ood.transaction.common.Reporting;
import com.udemy.ood.transaction.model.Customer;
import com.udemy.ood.transaction.model.Product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class TransactionService implements Accounting, Reporting {

   private Customer customer;
   private List<Product> products;

   private Double invoiceBalance = null;

   public TransactionService(Customer customer,
                             Product... products) {
      this.customer = customer;
      this.products = Arrays.asList(products);
   }

   private void addProductPriceToBalance(Product product) {
      invoiceBalance += product.getPrice();
   }

   @Override
   public void prepareInvoice() {
      products.forEach(this::addProductPriceToBalance);
   }

   @Override
   public void chargeCustomer() {
      customer.pay(invoiceBalance);
      invoiceBalance = null;
   }

   @Override
   public String getName() {
      return customer.getName();
   }

   @Override
   public String getDate() {
      return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy"));
   }

   @Override
   public String getProductBreakdown() {
      return products.toString();
   }
}
