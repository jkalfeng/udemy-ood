package com.udemy.ood.ems.subject;

import com.udemy.ood.employees_manager.model.Employee;
import com.udemy.ood.employees_manager.model.dao.EmployeeDAO;
import com.udemy.ood.ems.common.Observer;
import com.udemy.ood.ems.common.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Component
public class EmployeeManagementSystem implements Subject {

   private final List<Observer> observers = new ArrayList<>();
   private final EmployeeDAO employeeDAO;
   private final Properties employeesProperties;

   @Autowired
   public EmployeeManagementSystem(EmployeeDAO employeeDAO,
                                   Properties employeesProperties) {
      this.employeeDAO = employeeDAO;
      this.employeesProperties = employeesProperties;
   }

   @Override
   public synchronized void register(Observer observer) {
      observers.add(observer);
   }

   @Override
   public synchronized void remove(Observer observer) {
      observers.remove(observer);
   }

   @Override
   public void notifyObservers() {
      observers.forEach(Observer::notifySelf);
   }

   public void updateEmployees() {
      employeesProperties.keySet().forEach(id -> {
         String[] employeeData = employeesProperties.getProperty(String.valueOf(id)).split(",");
         employeeDAO.saveEmployee(new Employee(Integer.valueOf(String.valueOf(id)), employeeData[0], employeeData[1]));
         notifyObservers();
      });
   }

}
