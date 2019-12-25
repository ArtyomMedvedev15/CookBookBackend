package com.cookbook.dao.interfaces;

import com.cookbook.model.Recipe;

import java.util.List;

public interface RecipeDao {
    int save(Recipe recipe);

    Recipe getById(Integer id);

    int update(Recipe recipe);

    int deleteById(Integer id);

    List<Recipe> findAll();

    List<Recipe> findByName(String name);

}
