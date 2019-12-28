package com.cookbook.controller;

 import com.cookbook.dao.interfaces.RecipeDao;
 import com.cookbook.model.Subscribe_on_letter;
 import com.cookbook.model.TypeFood;
 import com.cookbook.model.TypeGoal;
 import com.cookbook.service.CommentServiceImpl;
 import com.cookbook.service.interfaces.CommentService;
 import com.cookbook.service.interfaces.RecipeService;
 import com.cookbook.service.interfaces.SubscribeService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.beans.factory.annotation.Qualifier;
 import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final SubscribeService subscribeService;

    private final RecipeService recipeService;


    @Autowired
    public HomeController(@Qualifier("getRecipeService") RecipeService recipeService, @Qualifier("getSubscribeService") SubscribeService subscribeService) {
        this.recipeService = recipeService;
        this.subscribeService = subscribeService;
     }

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("ExampleRecipes1",recipeService.findByName("Pancakes with ice cream, almond and strawberry"));
        model.addAttribute("ExampleRecipes2",recipeService.findByName("Hunter salad with smoked sausage"));
        model.addAttribute("BestsRecipes",recipeService.findByGoal(TypeGoal.BestRecipe));
        model.addAttribute("Glutens",recipeService.findByTypeFood(TypeFood.GlutenFree));
        return "home";
    }

    @PostMapping("/addSubscribe")
    public String addSubscrbe(@ModelAttribute("Subscribe")Subscribe_on_letter subscribe){
        subscribeService.save(subscribe);
        return "redirect:/";
    }

}

