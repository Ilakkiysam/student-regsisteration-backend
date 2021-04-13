package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class User {
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	private long courseid;
	


	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	private String email;
	private String coursename;
	
	public User() {
	
	}
	
	
	public User(long id, long courseid,String firstName, String lastName, String email, String coursename) {
		super();
		this.id = id;
		this.courseid = courseid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.coursename = coursename;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public long getCourseid() {
		return courseid;
	}


	public void setCourseid(long courseid) {
		this.courseid = courseid;
	}


	public String getCoursename() {
		return coursename;
	}


	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

}
