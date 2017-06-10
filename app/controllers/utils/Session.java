package controllers.utils;

import model.db.UserRole;
import play.mvc.Http;

import static play.mvc.Http.Context.current;

public class Session {
	private static final String USERNAME = "username";
	private static final String ROLE = "role";

	public static void setUsername(String username) {
		current().session().put(USERNAME, username);
	}

	public static String getUsername() {
		return current().session().get(USERNAME);
	}


	public static void setRole(UserRole role) {
		current().session().put(ROLE, role.name());
	}

	public static UserRole getRole() {
		return UserRole.valueOf(current().session().get(ROLE));
	}
}
