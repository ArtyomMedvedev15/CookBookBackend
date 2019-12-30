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

    private RecipeDaoImpl recipeDao;

    @Before
    public void setUp(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/CookBook");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        recipeDao = new RecipeDaoImpl(dataSource);
    }

    @Test
    public void save(){
        Recipe recipe = new Recipe("Flourless macaroons",
                "There isn't a gram of flour in this cookie, which mean it's suitable for a diet.",
                  "img/sr1.jpg",TypeFood.valueOf("GlutenFree"), TypeRecipe.valueOf("Breakfast"), TypeGoal.valueOf("Full"),new Date( new java.util.Date().getTime()),5);

        assertTrue(recipeDao.save(recipe) > 0);
    }

    @Test
    public void getId(){
        Recipe recipe = recipeDao.getById(1);
        assertNotNull(recipe);
    }

    @Test
    public void findAll(){
        List<Recipe>recipes = recipeDao.findAll();
        assertTrue(recipes.size() > 0);
     }

    @Test
    public void DeleteById(){
        assertTrue(recipeDao.deleteById(2) > 0);
    }

    @Test
    public void FindByName(){
        List<Recipe>res = recipeDao.findByName("Pancakes with ice cream, almond and strawberry");
        assertTrue(res.size() > 0);
     }

     @Test
    public void update(){
         Recipe recipe = new Recipe(8L,"Homemade burger\n","Homemade burger can " +
                 "never be compared to the one " +
                 "bought from the nearest fast food eatery.\n",
                  "img/r2.jpg",TypeFood.valueOf("Meat"), TypeRecipe.valueOf("Burgers"),
                 TypeGoal.valueOf("BestRecipe"),new Date( new java.util.Date().getTime()),5);
          assertTrue(recipeDao.update(recipe) > 0);
     }

    @Test
    public void FindByGoal(){
        List<Recipe>resFindByGoal = recipeDao.findByGoal(TypeGoal.Full);
        assertTrue(resFindByGoal.size() > 0);
      }

    @Test
    public void FindByTypeFood(){
        List<Recipe>findTypeFood = recipeDao.findByTypeFood(TypeFood.GlutenFree);
        assertTrue(findTypeFood.size() > 0);
        System.out.println(findTypeFood.get(4).getCountComment());
    }

    @Test
    public void FindByTypeFoodAndTypeRecipe(){
        assertTrue(recipeDao.findByFoodAndRecipe(TypeFood.GlutenFree,TypeRecipe.Breakfast).size() > 0);
    }

    @Test
    public void FindByTypeRecipe(){
        assertTrue(recipeDao.findByTypeRecipe(TypeRecipe.Breakfast).size() > 0);
     }

}
