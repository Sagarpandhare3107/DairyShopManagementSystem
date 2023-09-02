package com.project.dairyproject.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.implementation.bind.annotation.Default;

@Entity
@Table
@Component
public class AddressDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int AID;

	@NotEmpty(message = "District name required")
	@Length(max = 20, message = "District name cannot be more than 20 characters")
	@Pattern(regexp = "^[a-zA-Z]{3,20}$", message = "Please enter correct district name")
	private String district;

	@Length(max = 20, message = "Town name cannot be more than 20 characters")
	@Pattern(regexp = "^[a-zA-Z]{0,20}$", message = "Please enter correct town name")
	private String town;

	@NotEmpty(message = "Pincode required")
	@Length(min = 6, max = 6, message = "Please enter correct 6 digits pincode")
	@Column(length = 6, unique = true)
	@Pattern(regexp = "^[1-9]{1}[0-9]{2}[0-9]{3}$", message = "Please enter correct 6 digits pincode number")
	private String pincode;

	@NotEmpty(message = "State cannot be empty")
	@Pattern(regexp = "^[a-zA-Z]{3,20}$", message = "Please enter correct state name")
	private String state;

	@NotEmpty
	private String country;

	public int getAID() {
		return AID;
	}

	public void setAID(int aID) {
		AID = aID;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
