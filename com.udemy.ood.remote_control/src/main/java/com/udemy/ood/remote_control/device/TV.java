package com.udemy.ood.remote_control.device;

import com.udemy.ood.remote_control.remote.Controllable;

public class TV implements Controllable {
   public TV() {
   }

   @Override
   public void performOnAction() {
      System.out.println("TV is on");
   }

   @Override
   public void performOffAction() {
      System.out.println("TV is off");
   }
}
