package com.udemy.ood.ems.observer;

import com.udemy.ood.ems.common.Observer;
import org.springframework.stereotype.Component;

@Component("hrDepartment")
public class HRDepartment implements Observer {

   @Override
   public void notifySelf() {
      System.out.println("Update HR");
   }
}
