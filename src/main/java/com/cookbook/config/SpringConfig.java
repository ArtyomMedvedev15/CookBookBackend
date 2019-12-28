package com.cookbook.config;

import com.cookbook.dao.implementation.CommentDaoImpl;
import com.cookbook.dao.implementation.ContactDaoImpl;
import com.cookbook.dao.implementation.RecipeDaoImpl;
import com.cookbook.dao.implementation.SubscribeDaoImpl;
import com.cookbook.dao.interfaces.CommentDao;
import com.cookbook.dao.interfaces.ContactDao;
import com.cookbook.dao.interfaces.RecipeDao;
import com.cookbook.dao.interfaces.Subscribe_on_letterDao;
import com.cookbook.service.CommentServiceImpl;
import com.cookbook.service.RecipeServiceImpl;
import com.cookbook.service.SubscribeServiceImpl;
import com.cookbook.service.interfaces.CommentService;
import com.cookbook.service.interfaces.RecipeService;
import com.cookbook.service.interfaces.SubscribeService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.cookbook")
public class SpringConfig {

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/CookBook");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
     }

     @Bean
     public RecipeDao getRecipeDao(){
        return new RecipeDaoImpl(getDataSource());
     }

     @Bean
     public ContactDao getContactDao(){
        return new ContactDaoImpl(getDataSource());
     }

     @Bean
     public CommentDao getCommentDao(){
        return  new CommentDaoImpl(getDataSource());
     }

     @Bean
     public CommentService getCommentService(){
        return new CommentServiceImpl();
     }

     @Bean
     public Subscribe_on_letterDao getSubscribe_on_letterDao(){return  new SubscribeDaoImpl(getDataSource());}

     @Bean
     public SubscribeService getSubscribeService(){
        return  new SubscribeServiceImpl();
     }

     @Bean
     public RecipeService getRecipeService(){
        return new RecipeServiceImpl();
     }


}

