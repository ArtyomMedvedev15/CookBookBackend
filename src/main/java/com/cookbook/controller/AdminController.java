package com.cookbook.controller;

import com.cookbook.dao.interfaces.RecipeDao;
import com.cookbook.model.Recipe;
import com.cookbook.model.TypeFood;
import com.cookbook.model.TypeGoal;
import com.cookbook.model.TypeRecipe;
import com.cookbook.service.interfaces.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/admin")
@Controller
public class AdminController {

    private final RecipeService recipeService;

    @Autowired
    public AdminController(@Qualifier("getRecipeService") RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/listRecipes")
    public String listRecipes(Model model){
        model.addAttribute("Recipes",recipeService.findAll());
        return "ListRecipes";
    }

    @GetMapping("/addNewRecipe")
    public String addRecipeForm(Model model){

        model.addAttribute("typefood", TypeFood.values());
        model.addAttribute("typerecipe", TypeRecipe.values());
        model.addAttribute("typegoal", TypeGoal.values());

        return "AddNewRecipe";
    }

    @PostMapping("/addNewRecipe")
    public String addRecipeForm(@ModelAttribute("Recipe")Recipe recipe){
        recipeService.save(recipe);
        return "redirect:/admin/listRecipes";
    }

    @GetMapping("/Edit/{id}")
    public String EditById(@PathVariable String id,Model model){
        model.addAttribute("edtRecp",recipeService.getById(Integer.valueOf(id)));
        model.addAttribute("typefood", TypeFood.values());
        model.addAttribute("typerecipe", TypeRecipe.values());
        model.addAttribute("typegoal", TypeGoal.values());

        return "Edit";
    }

    @PostMapping("/Edit/{id}")
    public String EditById(@ModelAttribute("Recipe")Recipe recipe){
        recipeService.update(recipe);
        return "redirect:/admin/listRecipes";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable String id){
        recipeService.deleteById(Integer.valueOf(id));
        return "redirect:/admin/listRecipes";
    }
}
