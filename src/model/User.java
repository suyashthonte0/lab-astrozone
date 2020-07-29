package model;

import java.time.LocalDate;
//Type your code here
public class User{
	String name; 
	String email; 
	LocalDate dob; 
	String gender;
	public User(String name, String email, LocalDate dob, String gender)
	{
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public LocalDate getDob()
	{
		return dob;
	}
	public void setDob(LocalDate dob)
	{
		this.dob = dob;
	}
	public String getGender()
	{
		return gender;
	}
	public void setGender(String gender)
	{
		this.gender = gender;
	}	
}