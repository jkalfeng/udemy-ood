package com.udemy.ood.ems.config;

import com.udemy.ood.employees_manager.model.dao.EmployeeDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.udemy.ood.ems")
public class MainConfig {

   @Bean
   public EmployeeDAO employeeDAO() {
      return new EmployeeDAO();
   }

   @Bean
   public Properties employeesProperties() {
      Resource resource = new ClassPathResource("META-INF/employees.properties");
      try (InputStream inputStream = resource.getInputStream()) {

         Properties properties = new Properties();
         properties.load(inputStream);
         return properties;

      } catch (IOException e) {
         throw new RuntimeException(MessageFormat.format("Error loading properties from {}", resource), e);
      }
   }

}
