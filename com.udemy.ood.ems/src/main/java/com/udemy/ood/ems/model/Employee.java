package com.udemy.ood.ems.model;

import java.util.Objects;

public class Employee {

   private final int id;
   private String name;

   private static int counter;

   public Employee(String name) {
      this.id = ++counter;
      this.name = name;
   }

   public int getId() {
      return id;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Employee employee = (Employee) o;
      return id == employee.id && Objects.equals(name, employee.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name);
   }

   @Override
   public String toString() {
      return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
   }
}
