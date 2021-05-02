package controllers;

import java.util.List;

import models.ContactInfo;
import models.Product;
import models.Revenue;
import play.libs.Json;
import play.mvc.*;

import javax.inject.Inject;
import javax.inject.Singleton;

import static play.libs.Scala.asScala;

@Singleton
public class HomeController extends Controller {

    private final List<Product> productsList;
    private final String monthlyRevenues;
    private final ContactInfo contactInfo;

    @Inject
    public HomeController() {
        DataController dataController = new DataController();
        this.productsList = dataController.getProductsList();
        this.contactInfo = dataController.getContactInfo();
        this.monthlyRevenues = Json.stringify(Json.toJson(dataController.getLast6MonthsRevenue()));

    }

    public Result index(Http.Request request) {
        return ok(views.html.index.render(asScala(productsList), monthlyRevenues, contactInfo, request));
    }

}
