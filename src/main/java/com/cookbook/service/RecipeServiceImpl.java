package com.cookbook.service;

import com.cookbook.dao.interfaces.RecipeDao;
import com.cookbook.model.Recipe;
import com.cookbook.model.TypeFood;
import com.cookbook.model.TypeGoal;
import com.cookbook.service.interfaces.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

   @Autowired
   public RecipeDao recipeDao;


    @Override
    public int save(Recipe recipe) {
        recipe.setDateCreate(new Date(new java.util.Date().getTime()));
        return recipeDao.save(recipe);
    }

    @Override
    public Recipe getById(Integer id) {
        return recipeDao.getById(id);
    }

    @Override
    public int update(Recipe recipe) {
        return recipeDao.update(recipe);
    }

    @Override
    public int deleteById(Integer id) {
        return recipeDao.deleteById(id);
    }

    @Override
    public List<Recipe> findAll() {
        return recipeDao.findAll();
    }

    @Override
    public List<Recipe> findByName(String name) {
        return recipeDao.findByName(name);
    }

    @Override
    public List<Recipe> findByGoal(TypeGoal typeGoal) {
        return recipeDao.findByGoal(typeGoal);
    }

    @Override
    public List<Recipe> findByTypeFood(TypeFood typeFood) {
        return recipeDao.findByTypeFood(typeFood);
    }


}
