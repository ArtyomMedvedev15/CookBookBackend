package com.cookbook.dao.mapper;

import com.cookbook.model.Comment;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentMapper implements RowMapper<Comment> {
    @Override
    public Comment mapRow(ResultSet resultSet, int i) throws SQLException {
        Comment comment = new Comment();
        comment.setId(resultSet.getLong("id"));
        comment.setName(resultSet.getString("nameAuthor"));
        comment.setEmail(resultSet.getString("email"));
        comment.setDateadd(resultSet.getDate("DateAdd"));
        comment.setTextComment(resultSet.getString("TextComment"));
        comment.setRecipeId(resultSet.getInt("RecipeId"));
        return comment;
    }
}
