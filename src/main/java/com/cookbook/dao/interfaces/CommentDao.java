package com.cookbook.dao.interfaces;

import com.cookbook.model.Comment;

import java.util.List;

public interface CommentDao {
    int save(Comment comment);

    Comment getById(Integer id);

    int update(Comment comment);

    int deleteById(Integer id);

    List<Comment> findAll();

    List<Comment> findByName(String name);

    List<Integer> CountCommentByRecept(Long id);

}
