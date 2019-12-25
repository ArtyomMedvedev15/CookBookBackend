package com.cookbook.service.interfaces;

 import com.cookbook.model.Recipe;

 import java.util.List;

public interface RecipeService {
    int save(Recipe employee);

    Recipe getById(Integer id);

    int update(Recipe employee);

    int deleteById(Integer id);

    List<Recipe>findAll();

    List<Recipe> findByName(String name);
}

