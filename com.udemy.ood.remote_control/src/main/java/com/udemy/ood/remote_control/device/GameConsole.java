package com.udemy.ood.remote_control.device;

import com.udemy.ood.remote_control.remote.Controllable;

public class GameConsole implements Controllable {
   public GameConsole() {
   }

   @Override
   public void performOnAction() {
      System.out.println("Game on!");
   }

   @Override
   public void performOffAction() {
      System.out.println("Booo....");
   }
}
