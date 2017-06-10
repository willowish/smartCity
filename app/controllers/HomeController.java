package controllers;

import model.db.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security.Authenticated;

@Authenticated(LoginAuthenticator.class)
public class HomeController extends Controller {
	public Result index() {
		return ok(Json.toJson(User.finder.all()));
	}
}
