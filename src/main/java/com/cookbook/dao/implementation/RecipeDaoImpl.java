package com.cookbook.dao.implementation;

import com.cookbook.dao.interfaces.RecipeDao;
import com.cookbook.dao.mapper.RecipeMapper;
import com.cookbook.model.Recipe;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
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
                "describeRecipe=?,imgPath=?,DateAdd=?,Rating=?," +
                "TypeFoodId=?,TypeRecipeId=?,TypeViewId=? " +
                "WHERE id = ?";
        return jdbcTemplate.update(sql,recipe.getNameRecipe(),
                recipe.getDescribe(),recipe.getImgPath(),recipe.getDateCreate(),
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
        String sql = "SELECT * FROM Recipes";
        return jdbcTemplate.query(sql, new RecipeMapper());
    }

    @Override
    public List<Recipe> findByName(String name) {
        String patternForFound = "%"+name+"%";
        String sql = "SELECT * FROM Recipes WHERE Recipes.nameRecipe LIKE ?";
        return jdbcTemplate.query(sql,new RecipeMapper(),patternForFound);
    }
}
