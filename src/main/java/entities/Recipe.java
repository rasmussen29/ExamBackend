/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Marcus
 */
@Entity(name = "Recipes")

@Table(name = "Recipes")
public class Recipe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "u_id")
    private Long u_id;
    
    @Column(name = "id")
    private String id;
    
    @Column(name = "description")
    private String description;
        
    @Column(name = "prep_time")
    private String prep_time;
    
    @OneToMany(mappedBy="recipe") 
    private List<Instruction> preperaion_steps;
    
    @OneToMany(mappedBy="recipe") 
    private List<Ingredient> ingredients;
  
    public Recipe() {}
    
    public Recipe(String id, String description, String prep_time, List<Instruction> preperaion_steps, List<Ingredient> ingredients){
        this.id = id;
        this.description = description;
        this.prep_time = prep_time;
        this.preperaion_steps = preperaion_steps;
        this.ingredients = ingredients;
    }

    public Long getU_id() {
        return u_id;
    }

    public void setU_id(Long u_id) {
        this.u_id = u_id;
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
        return preperaion_steps;
    }

    public void setPreperaion_steps(List<Instruction> preperaion_steps) {
        this.preperaion_steps = preperaion_steps;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
    
    
}







