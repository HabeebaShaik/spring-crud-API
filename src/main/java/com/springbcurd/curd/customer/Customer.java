package com.springbcurd.curd.customer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C_Id", length = 10, nullable = false)
	private int Id;
	
	@NotNull(message = "Customer name cannot be blank")
	@Pattern(regexp = "^[A-Za-z][A-Za-z]{2,29}$",
    message = "Name must be of 3 to 30 length with only alphabets")
	@Column(name = "C_Name", length = 30, nullable = false)
	private String Name;

	@NotBlank(message = "Email cannot be blank")
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",
    message = "Email should be valid")
	@Column(name = "C_Email", length = 40, nullable = false)
	private String Email;
	
	@Positive
	@Digits(integer = 10, fraction = 0, message = "The Phone should be a number with integer part of up to 10 digits!")
	@Column(name = "C_Phone", length = 30, nullable = false)
	private long Phone;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getPhone() {
		return Phone;
	}

	public void setPhone(long phone) {
		Phone = phone;
	}

	public Customer(int id, String name, String email, long phone) {

		Id = id;
		Name = name;
		Email = email;
		Phone = phone;
	}

	public Customer() {

	}

	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Phone=" + Phone + "]";
	}

}
