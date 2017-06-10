package controllers;

import controllers.utils.Session;
import model.db.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import static model.db.UserRole.GUEST;


public class LoginController extends Controller {

	public Result login() {
		User user = Json.fromJson(request().body().asJson(), User.class);
		User userFromDb = User.finder.byId(user.username);
		if (userFromDb != null && (userFromDb.password.equals(Utils.hash(user.password))) || userFromDb.role == GUEST) {
			Session.setUsername(user.username);
			Session.setRole(user.role);
			return ok();
		} else {
			return unauthorized();
		}
	}

	public Result register() {
		User user;
		try {
			user = Json.fromJson(request().body().asJson(), User.class);
		} catch (Exception e) {
			return badRequest();
		}
		user.password = Utils.hash(user.password);
		try {
			user.insert();
		} catch (Exception e) {
			return status(409);//conflict
		}
		Session.setUsername(user.username);
		return ok();
	}

}
