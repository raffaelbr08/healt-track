package model;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe model para Informacoes do usuario
 * @author Rafael
 * @sinse  1.0
 * @version 1.0
 * 
 *
 */

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String age;
	private Date  birthdate;
	private Double height;
	private String email;
	private float lastWeight;
	private String lastPressure;
	private String password;
	private String gender;	
	
	
	public User(String name, String age, Date birthdate, Double height, String email, float lastWeight,
			String lastPressure, String password, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.birthdate = birthdate;
		this.height = height;
		this.email = email;
		this.lastWeight = lastWeight;
		this.lastPressure = lastPressure;
		this.password = password;
		this.gender = gender;
	}
	
	public User() {
	
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getLastWeight() {
		return lastWeight;
	}
	public void setLastWeight(float lastWeight) {
		this.lastWeight = lastWeight;
	}
	public String getLastPressure() {
		return lastPressure;
	}
	public void setLastPressure(String lastPressure) {
		this.lastPressure = lastPressure;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String infoUser() {
		return this.name + " " + this.age + this.email;
	}
	
	
}
