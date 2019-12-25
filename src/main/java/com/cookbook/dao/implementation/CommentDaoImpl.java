package com.cookbook.dao.implementation;

import com.cookbook.dao.interfaces.CommentDao;
import com.cookbook.dao.mapper.CommentMapper;
import com.cookbook.model.Comment;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class CommentDaoImpl implements CommentDao {

    private JdbcTemplate jdbcTemplate;

    public CommentDaoImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int save(Comment comment) {
        String sql = "INSERT INTO CommentRecipes(nameAuthor,email,DateAdd," +
                "TextComment,RecipeId) values(?,?,?,?,?)";
        return jdbcTemplate.update(sql,comment.getName(),comment.getEmail(),
                comment.getDateadd(),comment.getTextComment(),comment.getRecipeId());
    }

    @Override
    public Comment getById(Integer id) {
        String sql = "SELECT * FROM CommentRecipes WHERE id = ?";
        return jdbcTemplate.queryForObject(sql,new CommentMapper(),id);
    }

    @Override
    public int update(Comment comment) {
        String sql = "UPDATE CommentRecipes SET nameAuthor = ?, email = ?," +
                "DateAdd = ?,TextComment=?,RecipeId=? WHERE id = ?";
        return jdbcTemplate.update(sql,comment.getName(),comment.getEmail(),
                comment.getDateadd(),comment.getTextComment(),
                comment.getRecipeId(),comment.getId());
    }

    @Override
    public int deleteById(Integer id) {
        String sql = "DELETE CommentRecipes FROM CommentRecipes WHERE id = ?";
        return jdbcTemplate.update(sql,id);
    }

    @Override
    public List<Comment> findAll() {
        String sql = "SELECT * FROM CommentRecipes";
        return jdbcTemplate.query(sql,new CommentMapper());
    }

    @Override
    public List<Comment> findByName(String name) {
        String patternForFound = "%"+name+"%";
        String sql = "SELECT * FROM CommentRecipes WHERE CommentRecipes.nameAuthor LIKE ?";
        return jdbcTemplate.query(sql,new CommentMapper(),patternForFound);
     }
}
