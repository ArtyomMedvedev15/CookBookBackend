package com.cookbook.controller;

import com.cookbook.model.Recipe;
import com.cookbook.model.TypeFood;
import com.cookbook.model.TypeRecipe;
import com.cookbook.service.interfaces.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/recipes")
@Controller
public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    public RecipeController(@Qualifier("getRecipeService") RecipeService recipeService) {
        this.recipeService = recipeService;
    }


    @GetMapping("/recipies")
    public String recipies(Model model){
        model.addAttribute("resps",recipeService.findAll());
        model.addAttribute("tf",TypeFood.values());
        model.addAttribute("tr",TypeRecipe.values());
        return "Recipies";
    }

    @GetMapping("/vegans")
    public String recipeForVegan(Model model){
        model.addAttribute("resps",recipeService.findByTypeRecipe(TypeRecipe.Vegan));
        return "Vegan4";
    }

    @PostMapping("/findByNameVegan")
    public String recipeVegans(@RequestParam(name="filter")String filter,
                               Model model){
        if(filter.equals("")){
            model.addAttribute("resps",recipeService.findByTypeRecipe(TypeRecipe.Vegan));
        }else{
            if(recipeService.findByNameTypeRecipe(filter,TypeRecipe.Vegan).size()<0){
                model.addAttribute("result","Not found");
            }else {
                model.addAttribute("resps", recipeService.findByNameTypeRecipe(filter, TypeRecipe.Vegan));
            }
        }

        return "Vegan4";
    }

    @PostMapping("/findbyNameAndTypes")
    public String findByName(@RequestParam(name = "filter")String filter,
                             @RequestParam(name = "typeFood")String typeFood,
                             @RequestParam(name = "typeRecipe")String typeRecipe,
                             Model model){

        if(filter.equals("")&&typeFood.equals("None") && typeRecipe.equals("None")) {
            model.addAttribute("resps",recipeService.findAll());
        }else if(typeFood.equals("") && typeRecipe.equals("")){
            if(recipeService.findByName(filter).size() < 0){
                model.addAttribute("result","Not found");
            }else {
                model.addAttribute("resps", recipeService.findByName(filter));
            }
        }else{
            if(recipeService.findByFoodAndRecipe(TypeFood.valueOf(typeFood),
                    TypeRecipe.valueOf(typeRecipe)).size() < 0){
                model.addAttribute("result","Not found");
            }else {
                model.addAttribute("resps",
                        recipeService.findByFoodAndRecipe(TypeFood.valueOf(typeFood),
                                TypeRecipe.valueOf(typeRecipe)));
            }
        }

        model.addAttribute("tf",TypeFood.values());
        model.addAttribute("tr",TypeRecipe.values());
        return "Recipies";
    }

    @GetMapping("/getOneRecept/{id}")
    public String getOneReceptById(@PathVariable String id,Model model){
        model.addAttribute("recept",recipeService.getById(Integer.valueOf(id)));
        return "GetOneRecept";
    }
}
