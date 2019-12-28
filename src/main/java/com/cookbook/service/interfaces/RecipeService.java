package com.cookbook.service.interfaces;

 import com.cookbook.model.Recipe;
 import com.cookbook.model.TypeFood;
 import com.cookbook.model.TypeGoal;

 import java.util.List;

public interface RecipeService {
    int save(Recipe recipe);

    Recipe getById(Integer id);

    int update(Recipe recipe);

    int deleteById(Integer id);

    List<Recipe>findAll();

    List<Recipe> findByName(String name);

    List<Recipe> findByGoal(TypeGoal typeGoal);

    List<Recipe> findByTypeFood(TypeFood typeFood);

}

