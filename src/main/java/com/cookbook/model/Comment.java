package com.cookbook.model;

import java.sql.Date;

public class Comment {

    private Long id;
    private String name;
    private String email;
    private Date dateadd;
    private String textComment;
    private Integer recipeId;

    public Comment() {
    }

    public Comment(Long id, String name, String email, Date dateadd, String textComment, Integer recipeId) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateadd = dateadd;
        this.textComment = textComment;
        this.recipeId = recipeId;
    }

    public Comment(String name, String email, Date dateadd, String textComment, Integer recipeId) {
        this.name = name;
        this.email = email;
        this.dateadd = dateadd;
        this.textComment = textComment;
        this.recipeId = recipeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateadd() {
        return dateadd;
    }

    public void setDateadd(Date dateadd) {
        this.dateadd = dateadd;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public Integer getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dateadd=" + dateadd +
                ", textComment='" + textComment + '\'' +
                ", recipeId=" + recipeId +
                '}';
    }
}
