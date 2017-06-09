package model.db;

import com.avaje.ebean.Model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Company extends Model{
	public String name;
	public List<User> employee;
}
