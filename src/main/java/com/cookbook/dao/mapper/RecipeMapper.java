package com.cookbook.dao.mapper;


import com.cookbook.model.Recipe;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RecipeMapper implements RowMapper<Recipe> {
    @Override
    public Recipe mapRow(ResultSet resultSet, int i) throws SQLException {
        Recipe recipe = new Recipe();
        recipe.setId(resultSet.getLong("id"));
        recipe.setNameRecipe(resultSet.getString("nameRecipe"));
        recipe.setDescribe(resultSet.getString("describeRecipe"));
        recipe.setImgPath(resultSet.getString("imgPath"));
        recipe.setDateCreate(resultSet.getDate("DateAdd"));
        recipe.setRating(resultSet.getInt("Rating"));
        recipe.setTypeFood(resultSet.getInt("TypeFoodId"));
        recipe.setTypeRecipe(resultSet.getInt("TypeRecipeId"));
        recipe.setTypeGoal(resultSet.getInt("TypeViewId"));
        return recipe;
    }
}

