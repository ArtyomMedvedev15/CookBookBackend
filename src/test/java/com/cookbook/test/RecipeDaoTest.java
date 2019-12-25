package com.cookbook.test;

import com.cookbook.dao.implementation.RecipeDaoImpl;
import com.cookbook.model.Recipe;
import com.cookbook.model.TypeFood;
import com.cookbook.model.TypeGoal;
import com.cookbook.model.TypeRecipe;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

public class RecipeDaoTest {
    private DriverManagerDataSource dataSource;
    private RecipeDaoImpl recipeDao;
    @Before
    public void setUp(){
        dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/CookBook");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        recipeDao = new RecipeDaoImpl(dataSource);
    }

    @org.junit.Test
    public void save(){
        Recipe recipe = new Recipe("as","s","sd",TypeFood.valueOf("Meat"), TypeRecipe.valueOf("Lunch"), TypeGoal.valueOf("Full"),new Date( new java.util.Date().getTime()),2);
        assertTrue(recipeDao.save(recipe) > 0);
    }

    @org.junit.Test
    public void getId(){
        Recipe recipe = recipeDao.getById(1);
        assertNotNull(recipe);
    }

    @org.junit.Test
    public void findAll(){
        List<Recipe>recipes = recipeDao.findAll();
        assertTrue(recipes.size() > 0);
    }

    @org.junit.Test
    public void DeleteById(){
        assertTrue(recipeDao.deleteById(2) > 0);
    }

    @org.junit.Test
    public void FindByName(){
        List<Recipe>res = recipeDao.findByName("s");
        assertTrue(res.size() > 0);
     }

     @Test
    public void update(){
         Recipe recipe = new Recipe(1L,"asds","s","sd",TypeFood.valueOf("Meat"), TypeRecipe.valueOf("Lunch"), TypeGoal.valueOf("Full"),new Date( new java.util.Date().getTime()),2);

         assertTrue(recipeDao.update(recipe) > 0);
     }
}
