package com.udemy.ood.ems.application;

import com.udemy.ood.ems.config.MainConfig;
import com.udemy.ood.ems.observer.HRDepartment;
import com.udemy.ood.ems.subject.EmployeeManagementSystem;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HRMain {

   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

      EmployeeManagementSystem employeeManagementSystem = context.getBean(EmployeeManagementSystem.class);
      HRDepartment hrDepartment = context.getBean(HRDepartment.class);
      employeeManagementSystem.register(hrDepartment);

      ExecutorService service = Executors.newSingleThreadExecutor();
      service.execute(() -> System.out.println("listening for changes at HR"));
   }
}
