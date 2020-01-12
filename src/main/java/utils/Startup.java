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
        AddToDatabase("slow%20cooker%20beef%20stew");
        AddToDatabase("Smoked%20paprika%20goulash%20for%20the%20slow%20cooker");
        AddToDatabase("Pistachio%20chicken%20with%20pomegranate%20sauce");
        AddToDatabase("Cheesy%20leek%20and%20mustard%20soup");
        AddToDatabase("Christmas%20Stollen");
        AddToDatabase("Polly's%20eccles%20cakes");
        AddToDatabase("Braised%20beef%20in%20red%20wine");
        AddToDatabase("Moist%20garlic%20roasted%20chicken");
        AddToDatabase("Cheese%20and%20bacon%20stuffed%20pasta%20shells");
        AddToDatabase("Tofu%20vindaloo");

    }
    
    public static void AddToDatabase (String id) throws IOException{
        EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory(EMF_Creator.DbSelector.DEV, EMF_Creator.Strategy.DROP_AND_CREATE);
        EntityManager em = emf.createEntityManager();
        URL url = new URL("http://46.101.217.16:4000/recipe/" + id);
        InputStreamReader reader = new InputStreamReader(url.openStream());
        RecipeDTO dto = new Gson().fromJson(reader, RecipeDTO.class);

        // using the deserialized object
        System.out.println(dto.getId());
        System.out.println(dto.getDescription());
        System.out.println(dto.getPrep_time());
        
        Recipe newRecipe = new Recipe(dto.getId(), dto.getDescription(), dto.getPrep_time());
        em.getTransaction().begin();
        em.persist(newRecipe);
        em.getTransaction().commit();
    }

}
        
        

