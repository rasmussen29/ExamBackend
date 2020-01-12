/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.google.gson.Gson;
import dto.RecipeDTO;
import entities.Recipe;
import entities.User;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Marcus
 */
public class Startup {
    public static void main(String[] args) throws IOException{
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory(EMF_Creator.DbSelector.DEV, EMF_Creator.Strategy.DROP_AND_CREATE);
        EntityManager em = emf.createEntityManager();
   
        URL url = new URL("http://46.101.217.16:4000/recipe/Cheese%20and%20bacon%20stuffed%20pasta%20shells");
        InputStreamReader reader = new InputStreamReader(url.openStream());
        RecipeDTO dto = new Gson().fromJson(reader, RecipeDTO.class);

        // using the deserialized object
        System.out.println(dto.getId());
        System.out.println(dto.getDescription());
        System.out.println(dto.getPrep_time());
        System.out.println(dto.getPreperaion_steps());
        System.out.println(dto.getIngredients());
        
        Recipe newRecipe = new Recipe(dto.getId(), dto.getDescription(), dto.getPrep_time(),dto.getPreperaion_steps(),dto.getIngredients());
        em.getTransaction().begin();
        em.persist(newRecipe);
        em.getTransaction().commit();
        
        
    }

}
        
        

