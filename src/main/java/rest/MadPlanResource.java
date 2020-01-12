package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import dto.RecipeDTO;
import utils.EMF_Creator;
import facades.MadPlanFacade;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("madplan")
public class MadPlanResource {

    private static EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory(EMF_Creator.DbSelector.DEV, EMF_Creator.Strategy.CREATE);
    

    private static final MadPlanFacade FACADE =  MadPlanFacade.getFacadeExample(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final JsonParser jsonParser = new JsonParser();        
   
    @Path("search/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String getRecipeById(@PathParam("id") String id) throws MalformedURLException, IOException{  
        URL url = new URL("http://46.101.217.16:4000/recipe/"+id);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept", "application/json;charset=UTF-8");
        con.setRequestProperty("User-Agent", "server"); //remember if you are using SWAPI
        Scanner scan = new Scanner(con.getInputStream());
        String jsonStr = null;
        if (scan.hasNext()) {
          jsonStr = scan.nextLine();
        }
        scan.close();
        JsonElement jsonElement = jsonParser.parse(jsonStr);
        String prettyJson = GSON.toJson(jsonElement);
        return prettyJson;
    }
    
    @Path("all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String allRecipes() throws ParseException{
        List<RecipeDTO> personResults = FACADE.getAllRecipes();
        String json = GSON.toJson(personResults);
        return json;
    }
    
}
