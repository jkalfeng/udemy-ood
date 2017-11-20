package com.udemy.ood.main.ems;

import com.udemy.ood.ems.model.Employee;

import java.util.Arrays;
import java.util.List;

public class Agent {

   static List<Employee> getRecruits() {
      return Arrays.asList(
            new Employee("Jay"),
            new Employee("Kate"),
            new Employee("Joe"));
   }

}
