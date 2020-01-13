/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

import javax.persistence.Table;

/**
 *
 * @author Marcus
 */

@Entity(name = "Ingredient")
@Table(name = "ingredient")
public class Ingredient implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ingredient_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name = "ingredient")
    private String ingredient;
    
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "ingredients")
    private List<Recipe> recipes = new ArrayList<>();
 
    public Ingredient () {}
    
    public Ingredient(List<Recipe> recipes){
        this.recipes = recipes;
    }
    
    
}
