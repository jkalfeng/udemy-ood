module com.udemy.ood.ems {
   requires com.udemy.ood.employees.manager;
   requires spring.context;
   requires java.xml.ws.annotation;
   requires spring.core;
   requires spring.beans;
   requires java.desktop;
   opens com.udemy.ood.ems.config;
   opens com.udemy.ood.ems.common;
   opens com.udemy.ood.ems.observer;
   opens com.udemy.ood.ems.subject;
   opens com.udemy.ood.ems.application;
}