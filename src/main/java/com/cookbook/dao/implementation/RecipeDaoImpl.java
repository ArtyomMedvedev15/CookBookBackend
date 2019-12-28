package com.cookbook.dao.implementation;

import com.cookbook.dao.interfaces.RecipeDao;
import com.cookbook.dao.mapper.RecipeMapper;
import com.cookbook.dao.mapper.RecipeMapperCountComment;
import com.cookbook.model.Recipe;
import com.cookbook.model.TypeFood;
import com.cookbook.model.TypeGoal;
import com.cookbook.model.TypeRecipe;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RecipeDaoImpl implements RecipeDao {

    private JdbcTemplate jdbcTemplate;

    public RecipeDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int save(Recipe recipe) {
        String sql = "INSERT INTO Recipes(nameRecipe,describeRecipe,imgPath," +
                "DateAdd,Rating,TypeFoodId,TypeRecipeId,TypeViewId)" +
                " values (?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,recipe.getNameRecipe(),
                recipe.getDescribe(),recipe.getImgPath(),
                recipe.getDateCreate(),recipe.getRating(),
                recipe.getTypeFood(),
                recipe.getTypeRecipe(),
                recipe.getTypeGoal());
    }

    @Override
    public Recipe getById(Integer id) {
        String sql = "SELECT * FROM Recipes WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new RecipeMapper(),id);
    }

    @Override
    public int update(Recipe recipe) {
        String sql = "UPDATE Recipes SET nameRecipe = ?," +
                "describeRecipe=?,imgPath=?,Rating=?," +
                "TypeFoodId=?,TypeRecipeId=?,TypeViewId=? " +
                "WHERE id = ?";
        return jdbcTemplate.update(sql,recipe.getNameRecipe(),
                recipe.getDescribe(),recipe.getImgPath(),
                recipe.getRating(),recipe.getTypeFood(),recipe.getTypeRecipe(),
                recipe.getTypeGoal(),recipe.getId());
    }

    @Override
    public int deleteById(Integer id) {
        String sql = "delete recipes from Recipes where id = ?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public List<Recipe> findAll() {
        String sql = " select Recipes.id,nameRecipe,describeRecipe,imgPath,Recipes.DateAdd,TypeFoodId,TypeRecipeId,TypeViewId,Rating,COUNT(c.TextComment) from Recipes left join CommentRecipes as c on Recipes.id = c.id GROUP BY Recipes.id";
        return jdbcTemplate.query(sql, new RecipeMapperCountComment());
    }

    @Override
    public List<Recipe> findByName(String name) {
        String patternForFound = "%"+name+"%";
        String sql = "SELECT * FROM Recipes WHERE Recipes.nameRecipe LIKE ?";
        return jdbcTemplate.query(sql,new RecipeMapper(),patternForFound);
    }

    @Override
    public List<Recipe> findByGoal(TypeGoal typeGoal) {
        String sql = "SELECT * FROM Recipes WHERE TypeViewId = ?";
        return jdbcTemplate.query(sql,new RecipeMapper(),typeGoal.ordinal());
    }

    @Override
    public List<Recipe> findByTypeFood(TypeFood typeFood) {
        String sql = " select Recipes.id,nameRecipe,describeRecipe,imgPath,Recipes.DateAdd,TypeFoodId,TypeRecipeId,TypeViewId,Rating,COUNT(c.TextComment) from Recipes left join CommentRecipes as c on Recipes.id = c.RecipeId  where TypeFoodId = ? GROUP BY Recipes.id";
        return jdbcTemplate.query(sql,new RecipeMapperCountComment(),typeFood.ordinal());
    }

    @Override
    public List<Recipe> findByFoodAndRecipe(TypeFood typeFood, TypeRecipe typeRecipe) {
        String sql = "SELECT * FROM Recipes WHERE TypeFoodId = ? and TypeRecipeId = ?";
        return jdbcTemplate.query(sql,new RecipeMapper(),typeFood.ordinal(),typeRecipe.ordinal());
    }


}
