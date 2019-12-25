package com.cookbook.service;

import com.cookbook.dao.interfaces.RecipeDao;
import com.cookbook.model.Recipe;
import com.cookbook.service.interfaces.RecipeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeDao recipeDao;


    @Override
    public int save(Recipe employee) {
        return recipeDao.save(employee);
    }

    @Override
    public Recipe getById(Integer id) {
        return recipeDao.getById(id);
    }

    @Override
    public int update(Recipe employee) {
        return recipeDao.update(employee);
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


}
