package model.db;

import com.avaje.ebean.Model;

import javax.persistence.Entity;

@Entity
public class User extends Model {
	public String username;
	public String password;

	public UserRole role;
	public Company company;


	public static User.Finder<String, User> finder = new User.Finder<>(User.class);

}
