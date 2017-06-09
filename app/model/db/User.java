package model.db;

import model.db.UserRole;

@Entity
public class User {
	public String username;
	public String password;

	public UserRole role;
	public Company company;

}
