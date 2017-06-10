package controllers;

import com.avaje.ebean.Ebean;
import com.avaje.ebean.Model;

import java.util.UUID;

import model.db.User;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

public class HomeController extends Controller {

    public Result index() {
        User user = new User();
        user.username = UUID.randomUUID().toString();
        user.save();
        return ok(Json.toJson(User.finder.all()));
    }

}
