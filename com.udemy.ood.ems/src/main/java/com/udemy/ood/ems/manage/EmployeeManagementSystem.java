package com.udemy.ood.ems.manage;

import com.udemy.ood.ems.common.Observable;
import com.udemy.ood.ems.common.Observer;
import com.udemy.ood.ems.model.Employee;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public final class EmployeeManagementSystem implements Observable {

   private static EmployeeManagementSystem EMS = null;

   private final List<Observer> observers = new ArrayList<>();
   private final Map<Integer, Employee> database = new Hashtable<>();

   public static EmployeeManagementSystem getInstance() {
      if (EMS == null) {
         synchronized (EmployeeManagementSystem.class) {
            if (EMS == null) {
               EMS = new EmployeeManagementSystem();
            }
         }
      }
      return EMS;
   }

   private EmployeeManagementSystem() {
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
   public void notifyObserver(String message) {
      observers.forEach(o -> o.update(message));
   }

   public boolean hire(Employee employee) {
      Employee e = database.put(employee.getId(), employee);
      if (e == null) {
         notifyObserver("Newly hired: " + employee);
         return true;
      }
      return false;
   }

   public Employee fire(int employeeId) {
      Employee e = database.remove(employeeId);
      if (e != null) {
         notifyObserver("You're fired: " + e);
         return e;
      }
      return null;
   }
}
