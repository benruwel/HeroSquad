import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.*;


public class App {
    public static void main(String[] args) {
        
        staticFileLocation("/public");

        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("username", request.session().attribute("username"));
            List<Squad> squads = Squad.getAll();
            model.put("squads", squads);
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "new-squad.hbs");
        }, new HandlebarsTemplateEngine());

        post("/squads/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String squadName = request.queryParams("squadName");
            Integer maxNumber = Integer.parseInt(request.queryParams("maxNumber"));
            String cause = request.queryParams("cause");
            Squad newSquad = new Squad(squadName, cause, maxNumber);
            response.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());
        
        get("/heroes/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            List<Squad> squads = Squad.getAll();
            model.put("squads", squads);
            return new ModelAndView(model, "new-hero.hbs");
        }, new HandlebarsTemplateEngine());

        post("/login", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            String inputtedUsername = request.queryParams("username");
            request.session().attribute("username", inputtedUsername);
            model.put("username", inputtedUsername);
            response.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());


    }
}
