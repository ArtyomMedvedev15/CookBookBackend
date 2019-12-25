package com.cookbook.config;

import com.cookbook.dao.implementation.ContactDaoImpl;
import com.cookbook.dao.implementation.RecipeDaoImpl;
import com.cookbook.dao.interfaces.ContactDao;
import com.cookbook.dao.interfaces.RecipeDao;
import com.cookbook.service.RecipeServiceImpl;
import com.cookbook.service.interfaces.RecipeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/Employee");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
     }

     @Bean
     public RecipeDao employeeDao(){
        return new RecipeDaoImpl(getDataSource());
     }

     @Bean
     public ContactDao contactDao(){
        return new ContactDaoImpl(getDataSource());
     }

     @Bean
     public RecipeService employeeService(){
        return new RecipeServiceImpl();
     }

}

