package com.udemy.ood.employees_manager.database;

import com.udemy.ood.employees_manager.model.Employee;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class DatabaseConnectionManager {

   private static DatabaseConnectionManager instance = new DatabaseConnectionManager();

   private AtomicBoolean connected = new AtomicBoolean(false);
   // pretend this is the database...
   private final Map<Integer, Employee> database = new HashMap<>();

   private DatabaseConnectionManager() {
   }

   public static DatabaseConnectionManager getInstance() {
      return instance;
   }

   public void connect() {
      connected.set(true);
      System.out.println("Successfully connected to the database");
   }

   public void disconnect() {
      connected.set(false);
      System.out.println("Successfully disconnected from the database");
   }

   public Map<Integer, Employee> getDatabase() {
      if (!connected.get()) {
         throw new RuntimeException("Database not connected, cannot perform action");
      }
      return database;
   }

}
