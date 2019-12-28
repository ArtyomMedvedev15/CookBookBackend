package com.cookbook.test;

import com.cookbook.dao.implementation.CommentDaoImpl;
import com.cookbook.model.Comment;
import com.cookbook.model.Recipe;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Date;
import java.util.List;

import static org.junit.Assert.*;

public class CommentDaoTest {
    private DriverManagerDataSource dataSource;
    private CommentDaoImpl commentDao;

    @Before
    public void setUp(){
        dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/CookBook");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        commentDao = new CommentDaoImpl(dataSource);
    }

    @Test
    public void save(){
        Comment comment = new Comment("Tim","asd@tim01bro",new Date(new java.util.Date().getTime()),"TestComment",1);
        assertTrue(commentDao.save(comment) > 0);
    }

    @Test
    public void getOne(){
        Comment comment = commentDao.getById(1);
        assertNotNull(comment);
    }

    @Test
    public void update(){
        Comment comment = new Comment(1L,"Tim","ASasd@tim01bro",new Date(new java.util.Date().getTime()),"TestComment",1);
        assertTrue(commentDao.update(comment) > 0);
    }

    @Test
    public void delete(){
        assertTrue(commentDao.deleteById(2) > 0);
    }

    @Test
    public void findAll(){
         assertTrue(commentDao.findAll().size() > 0);
    }

    @Test
    public void findByName(){
        assertTrue(commentDao.findByName("T").size() > 0);
    }

    @Test
    public void coutnComment(){
      }
}
