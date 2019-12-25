package com.cookbook.model;

import java.sql.Date;

public class Recipe {
    private Long id;
    private String nameRecipe;
    private String describe;
    private String imgPath;
    private Integer TypeFood;
    private Integer TypeRecipe;
    private Integer TypeGoal;
    private Date DateCreate;
    private Integer rating;

    public Recipe(Long id, String nameRecipe, String describe, String imgPath, com.cookbook.model.TypeFood typeFood,
                  com.cookbook.model.TypeRecipe typeRecipe, com.cookbook.model.TypeGoal typeGoal, Date dateCreate, Integer rating) {
        this.id = id;
        this.describe = describe;
        this.imgPath = imgPath;
        TypeFood = typeFood.ordinal();
        TypeRecipe = typeRecipe.ordinal();
        TypeGoal = typeGoal.ordinal();
        DateCreate = dateCreate;
        this.nameRecipe = nameRecipe;
        this.rating = rating;
    }

    public Recipe(String nameRecipe, String describe, String imgPath, com.cookbook.model.TypeFood typeFood,
                  com.cookbook.model.TypeRecipe typeRecipe, com.cookbook.model.TypeGoal typeGoal, Date dateCreate, Integer rating) {
        this.describe = describe;
        this.imgPath = imgPath;
        TypeFood = typeFood.ordinal();
        TypeRecipe = typeRecipe.ordinal();
        TypeGoal = typeGoal.ordinal();
        DateCreate = dateCreate;
        this.nameRecipe = nameRecipe;
        this.rating = rating;
    }

    public Recipe() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }


    public Date getDateCreate() {
        return DateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        DateCreate = dateCreate;
    }


    public String getNameRecipe() {
        return nameRecipe;
    }

    public void setNameRecipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }


    public Integer getTypeFood() {
        return TypeFood;
    }

    public void setTypeFood(Integer typeFood) {
        TypeFood = typeFood;
    }

    public Integer getTypeRecipe() {
        return TypeRecipe;
    }

    public void setTypeRecipe(Integer typeRecipe) {
        TypeRecipe = typeRecipe;
    }

    public Integer getTypeGoal() {
        return TypeGoal;
    }

    public void setTypeGoal(Integer typeGoal) {
        TypeGoal = typeGoal;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", nameRecipe='" + nameRecipe + '\'' +
                ", describe='" + describe + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", TypeFood=" + TypeFood +
                ", TypeRecipe=" + TypeRecipe +
                ", TypeGoal=" + TypeGoal +
                ", DateCreate=" + DateCreate +
                ", rating=" + rating +
                '}';
    }
}
