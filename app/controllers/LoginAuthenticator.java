package controllers;

import controllers.utils.Session;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

public class LoginAuthenticator extends Security.Authenticator{

	@Override
	public String getUsername(Http.Context ctx) {
		return Session.getUsername();
	}

	@Override
	public Result onUnauthorized(Http.Context ctx) {
		return super.onUnauthorized(ctx);
	}
}
