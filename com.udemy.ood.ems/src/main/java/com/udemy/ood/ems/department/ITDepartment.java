package com.udemy.ood.ems.department;

import com.udemy.ood.ems.common.Observer;

public class ITDepartment implements Observer {
   @Override
   public void update(String message) {
      System.out.println("[IT] " + message);
   }
}
