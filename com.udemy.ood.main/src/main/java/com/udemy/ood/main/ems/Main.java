package com.udemy.ood.main.ems;

import com.udemy.ood.ems.department.HRDepartment;
import com.udemy.ood.ems.department.ITDepartment;
import com.udemy.ood.ems.department.PayrollDepartment;
import com.udemy.ood.ems.manage.EmployeeManagementSystem;
import com.udemy.ood.ems.model.Employee;

import java.util.List;

public class Main {

   public static void main(String[] args) {
      EmployeeManagementSystem ems = EmployeeManagementSystem.getInstance();
      ems.register(new HRDepartment());
      ems.register(new PayrollDepartment());
      ems.register(new ITDepartment());

      List<Employee> recruits = Agent.getRecruits();
      recruits.forEach(ems::hire);
      ems.fire(recruits.get(1).getId());
   }
}
