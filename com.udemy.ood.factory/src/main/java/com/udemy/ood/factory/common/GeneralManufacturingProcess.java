package com.udemy.ood.factory.common;

public interface GeneralManufacturingProcess {

   default GeneralManufacturingProcess launchProcess() {
      assembleProduct();
      testProduct();
      packageProduct();
      storeProduct();
      return this;
   }

   Manufacturable getProduct();

   void storeProduct();

   void packageProduct();

   void testProduct();

   void assembleProduct();

}
