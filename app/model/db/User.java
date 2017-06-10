package model.db;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User extends Model {
	@Id
	public String username;
	public String password;

	public UserRole role = UserRole.GUEST;


	public static User.Finder<String, User> finder = new User.Finder<>(User.class);

}
