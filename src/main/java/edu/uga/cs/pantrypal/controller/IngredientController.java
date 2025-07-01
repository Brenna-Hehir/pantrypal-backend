package edu.uga.cs.pantrypal.controller;

import edu.uga.cs.pantrypal.model.Ingredient;
import edu.uga.cs.pantrypal.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ingredients")
@CrossOrigin(origins = "https://brenna-hehir.github.io", allowCredentials = "true")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    @PostMapping
    public Ingredient createIngredient(@RequestBody Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }
}
