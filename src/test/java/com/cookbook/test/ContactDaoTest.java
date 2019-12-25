package com.cookbook.test;

import com.cookbook.dao.implementation.ContactDaoImpl;
import com.cookbook.model.ContactUs;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

public class ContactDaoTest {

    private DriverManagerDataSource dataSource;
    private ContactDaoImpl contactDao;

    @Before
    public void setUp(){
        dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/CookBook");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        contactDao = new ContactDaoImpl(dataSource);
    }

    @Test
    public void save(){
        ContactUs contactUs = new ContactUs("Tisam","Brok","asd",1,new Date(new java.util.Date().getTime()));
        assertTrue(contactDao.save(contactUs) > 0);
    }

    @Test
    public void getOne(){
        ContactUs contactUs = contactDao.getById(1);
        assertNotNull(contactUs);
     }

     @Test
    public void update(){
         ContactUs contactUs = new ContactUs(1L,"Tim","Brok","TimBrok@asd.cs",1,new Date(new java.util.Date().getTime()));
         assertTrue(contactDao.update(contactUs) > 0);
     }

     @Test
    public void Delete(){
        assertTrue(contactDao.deleteById(2) > 0);
     }

     @Test
    public void findAll(){
         List<ContactUs>contactUs = contactDao.findAll();
         assertTrue(contactUs.size() > 0);
     }

     @Test
    public void findByName(){
        List<ContactUs> contactUs = contactDao.findByName("T");
        assertTrue(contactUs.size() > 0);
         System.out.println(contactUs);
     }
}
