package model.db;

import com.avaje.ebean.Model;

import javax.persistence.Entity;

import model.db.UserRole;

@Entity
public class User extends Model{
	public String username;
	public String password;

	public UserRole role;
	public Company company;

}
