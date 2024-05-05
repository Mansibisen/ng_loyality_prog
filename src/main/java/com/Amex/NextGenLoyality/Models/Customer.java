package com.Amex.NextGenLoyality.Models;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customer_id;
	private boolean attrition_flag;  // 1 if account is closed else 0
	private String name;
	private String email;
	private String phone_number;
	private String credit_card_number;
	private int age;  
	private boolean gender; // 0 for male, 1 for female
	private long loyalty_points;


	public long getLoyalty_points() {
		return loyalty_points;
	}

	public void setLoyalty_points(long loyalty_points) {
		this.loyalty_points = loyalty_points;
	}

	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public boolean isAttrition_flag() {
		return attrition_flag;
	}
	public void setAttrition_flag(boolean attrition_flag) {
		this.attrition_flag = attrition_flag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getCredit_card_number() {
		return credit_card_number;
	}
	public void setCredit_card_number(String credit_card_number) {
		this.credit_card_number = credit_card_number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

}