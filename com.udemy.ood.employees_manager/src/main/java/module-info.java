module com.udemy.ood.employees.manager {
   requires java.sql;
   exports com.udemy.ood.employees_manager.client;
   exports com.udemy.ood.employees_manager.model;
   exports com.udemy.ood.employees_manager.model.dao;
}