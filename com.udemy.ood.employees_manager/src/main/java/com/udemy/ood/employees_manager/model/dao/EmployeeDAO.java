package com.udemy.ood.employees_manager.model.dao;

import com.udemy.ood.employees_manager.database.DatabaseConnectionManager;
import com.udemy.ood.employees_manager.model.Employee;

import java.util.Map;
import java.util.Optional;

public class EmployeeDAO implements AutoCloseable {

   private DatabaseConnectionManager connectionManager;

   public EmployeeDAO() {
      connectionManager = DatabaseConnectionManager.getInstance();
   }

   public synchronized void saveEmployee(Employee employee) {
      connectionManager.connect();
      Map<Integer, Employee> database = connectionManager.getDatabase();
      if (!database.containsKey(employee.getId())) {
         database.put(employee.getId(), employee);
      }
      connectionManager.disconnect();
   }

   public synchronized void deleteEmployee(Employee employee) {
      connectionManager.connect();
      Map<Integer, Employee> database = connectionManager.getDatabase();
      if (database.containsKey(employee.getId())) {
         database.remove(employee.getId());
      }
      connectionManager.disconnect();
   }

   public Employee getEmployeeByID(int id) {
      return Optional.ofNullable(connectionManager.getDatabase().get(id)).orElse(null);
   }

   @Override
   public void close() throws Exception {
      connectionManager.disconnect();
   }

}
