import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String inputtedNumberString = request.queryParams("userNumber");
      Long inputtedNumber = Long.parseLong(inputtedNumberString);

      NumbersToWords myNumberToWords = new NumbersToWords();
      String finalWord = myNumberToWords.runNumbersToWords(inputtedNumber);

      model.put("finalWord", finalWord);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


  }

}
