package com.cookbook.service.interfaces;

 import com.cookbook.model.Recipe;
 import com.cookbook.model.TypeFood;
 import com.cookbook.model.TypeGoal;
 import com.cookbook.model.TypeRecipe;

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

    List<Recipe> findByTypeRecipe(TypeRecipe typeRecipe);


    List<Recipe> findByNameTypeRecipe(String name,TypeRecipe typeRecipe);

    List<Recipe> findByFoodAndRecipe(TypeFood typeFood, TypeRecipe typeRecipe);

    String getTypeFood(Integer id);

    String getTypeRecipe(Integer id);

    String getTypeView(Integer id);

}

