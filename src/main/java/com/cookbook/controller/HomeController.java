package com.cookbook.controller;

 import com.cookbook.dao.interfaces.RecipeDao;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {


    private final RecipeDao recipeDao;

    @Autowired
    public HomeController(RecipeDao recipeDao) {
        this.recipeDao = recipeDao;
    }

    @GetMapping("/")
    public String index(Model model){
         return "ListEmployeesPage";
    }



}

