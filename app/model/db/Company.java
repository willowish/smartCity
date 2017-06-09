package model.db;

import java.util.List;

@Entity
public class Company {
	public String name;
	public List<User> employee;
}
