package facades;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import dto.RecipeDTO;
import entities.Recipe;
import entities.RenameMe;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public abstract class MadPlanFacade implements Callable{

    private static MadPlanFacade instance;
    private static EntityManagerFactory emf;
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final JsonParser jsonParser = new JsonParser();

    
    private MadPlanFacade() {}
    
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    public static MadPlanFacade getFacadeExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new MadPlanFacade() {
                @Override
                public Object call() throws Exception {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    
    public List<RecipeDTO> getAllRecipes() throws ParseException{
        EntityManager em = getEntityManager();
        List<RecipeDTO> personDTOs = new ArrayList<RecipeDTO>();
        try{
            TypedQuery<Recipe> query = em.createQuery("SELECT p FROM Recipes p", Recipe.class);
            List<Recipe> recipes = query.getResultList();
            for (int i = 0; i < recipes.size(); i++) {
                personDTOs.add(new RecipeDTO(recipes.get(i)));  
            }
            return personDTOs;
        }finally{
            em.close();
        }
    }  
}
