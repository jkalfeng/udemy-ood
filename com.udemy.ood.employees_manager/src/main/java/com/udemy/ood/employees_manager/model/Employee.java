package com.udemy.ood.employees_manager.model;

public class Employee {

   private final int id;
   private String name;
   private String department;

   public Employee(int id, String name, String department) {
      this.id = id;
      this.name = name;
      this.department = department;
   }

   @Override
   public String toString() {
      return "Employee{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", department='" + department + '\'' +
            '}';
   }

   public int getId() {
      return id;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Employee employee = (Employee) o;
      return id == employee.id && name.equals(employee.name) && department.equals(employee.department);
   }

   @Override
   public int hashCode() {
      int result = id;
      result = 31 * result + name.hashCode();
      result = 31 * result + department.hashCode();
      return result;
   }

}
