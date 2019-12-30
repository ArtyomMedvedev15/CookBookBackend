package com.cookbook.service;

import com.cookbook.dao.interfaces.RecipeDao;
import com.cookbook.model.Recipe;
import com.cookbook.model.TypeFood;
import com.cookbook.model.TypeGoal;
import com.cookbook.model.TypeRecipe;
import com.cookbook.service.interfaces.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    @Autowired
    private RecipeDao recipeDao;

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

    @Override
    public List<Recipe> findByTypeRecipe(TypeRecipe typeRecipe) {
        return recipeDao.findByTypeRecipe(typeRecipe);
    }

    @Override
    public List<Recipe> findByNameTypeRecipe(String name, TypeRecipe typeRecipe) {
        return recipeDao.findByNameTypeRecipe(name,typeRecipe);
    }

    @Override
    public List<Recipe> findByFoodAndRecipe(TypeFood typeFood, TypeRecipe typeRecipe) {
        return recipeDao.findByFoodAndRecipe(typeFood,typeRecipe);
    }

    @Override
    public String getTypeFood(Integer id) {
        return TypeFood.values()[id].toString();
    }

    @Override
    public String getTypeRecipe(Integer id) {
        return TypeRecipe.values()[id].toString();
    }

    @Override
    public String getTypeView(Integer id) {
        return TypeGoal.values()[id].toString();
    }


}
