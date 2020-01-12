/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Ingredient;
import entities.Instruction;
import entities.Recipe;
import java.text.ParseException;
import java.util.List;


public class RecipeDTO {
    String id;
    String description;
    String prep_time;
    List<Instruction> preparaion_steps;  
    List<Ingredient> ingredients;
    
    public RecipeDTO(){}
    
    public RecipeDTO(Recipe recipe) throws ParseException{
        this.id = recipe.getId();
        this.description = recipe.getDescription();
        this.prep_time = recipe.getPrep_time();
        this.preparaion_steps = recipe.getPreperaion_steps();
        this.ingredients = recipe.getIngredients();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrep_time() {
        return prep_time;
    }

    public void setPrep_time(String prep_time) {
        this.prep_time = prep_time;
    }

    public List<Instruction> getPreperaion_steps() {
        return preparaion_steps;
    }

    public void setPreperaion_steps(List<Instruction> preperaion_steps) {
        this.preparaion_steps = preperaion_steps;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }


    
}
