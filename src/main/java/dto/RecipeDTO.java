/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import entities.Ingredient;
import entities.Recipe;
import java.util.ArrayList;
import java.util.List;

public class RecipeDTO {
    public Long u_id;
    public String id;
    public String description;
    public String prep_time;
    public List<Ingredient> ingredients = new ArrayList<>();

    public RecipeDTO(){}
    
    public RecipeDTO(Recipe recipe) {
        this.u_id = recipe.getU_id();
        this.id = recipe.getId();
        this.description = recipe.getDescription();
        this.prep_time = recipe.getPrep_time();
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

    public Long getU_id() {
        return u_id;
    }

    public void setU_id(Long u_id) {
        this.u_id = u_id;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    
    
}
