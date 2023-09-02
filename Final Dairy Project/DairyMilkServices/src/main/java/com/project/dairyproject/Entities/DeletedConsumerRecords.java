package com.project.dairyproject.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class DeletedConsumerRecords {

	@Id
	private int consumerId;
	private String firstName;
	private String lastName;
	private String gender;
	private String phoneNumber;
	private String emailId;
	private String street;
	private String username;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "AID")
	private AddressDetails address;

	public int getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public AddressDetails getAddress() {
		return address;
	}

	public void setAddress(AddressDetails address) {
		this.address = address;
	}

}
