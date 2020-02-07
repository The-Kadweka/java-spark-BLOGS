import java.util.HashMap;
import java.util.Map;

import org.eclipse.jetty.client.api.Request;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) { //type “psvm + tab” to autocrats this :)
        staticFileLocation("/public");

        get("/", (Request, response) ->{
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

    }
}