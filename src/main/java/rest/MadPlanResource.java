package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import dto.RecipeDTO;
import utils.EMF_Creator;
import facades.MadPlanFacade;
import java.text.ParseException;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.core.UriInfo;

@Path("madplan")
public class MadPlanResource {
    
    private static EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory(EMF_Creator.DbSelector.DEV, EMF_Creator.Strategy.CREATE);
    private static final MadPlanFacade FACADE =  MadPlanFacade.getMadPlanFacade(EMF);
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    @Context
    private UriInfo context;

    @Context
    SecurityContext securityContext;   
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("all")
    public String allRecipes() throws ParseException{
        List<RecipeDTO> personResults = FACADE.getAllRecipes();
        String json = GSON.toJson(personResults);
        return json;
    }
    
}
