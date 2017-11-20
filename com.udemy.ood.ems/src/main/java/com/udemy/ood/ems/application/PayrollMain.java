package com.udemy.ood.ems.application;

import com.udemy.ood.ems.config.MainConfig;
import com.udemy.ood.ems.observer.PayrollDepartment;
import com.udemy.ood.ems.subject.EmployeeManagementSystem;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PayrollMain {

   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);

      EmployeeManagementSystem employeeManagementSystem = context.getBean(EmployeeManagementSystem.class);
      PayrollDepartment payrollDepartment = context.getBean(PayrollDepartment.class);
      employeeManagementSystem.register(payrollDepartment);

      ExecutorService service = Executors.newSingleThreadExecutor();
      service.execute(() -> System.out.println("listening for changes at Payroll"));
   }
}
