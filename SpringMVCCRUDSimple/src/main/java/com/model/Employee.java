package com.model;

public class Employee {

	int id;
	String fName;
	String lName;
	String password;
	String email;
	int age;
	String telephone;

	public Employee() {
		super();
	}

	public Employee(String fName, String lName, String password, String email, int age, String telephone) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.password = password;
		this.email = email;
		this.age = age;
		this.telephone = telephone;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}
