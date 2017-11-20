package com.udemy.ood.ems.application;

import com.udemy.ood.ems.config.MainConfig;
import com.udemy.ood.ems.subject.EmployeeManagementSystem;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmsMain {

   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

      EmployeeManagementSystem employeeManagementSystem = context.getBean(EmployeeManagementSystem.class);

      ExecutorService service = Executors.newSingleThreadExecutor();
      service.execute(employeeManagementSystem::updateEmployees);
   }

}
