package com.project.dairyproject.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class ConsumerQuery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int QID;

	@OneToOne
	@JoinColumn(name = "consumerId")
	private ConsumerDetails consumerDetails;

	@NotEmpty(message = "Query cannot be empty !")
	@Length(max = 400, message = "Query message cannot be more 400 characters !")
	@Lob
	private String message;

	private String dateTime;

	public int getQID() {
		return QID;
	}

	public void setQID(int qID) {
		QID = qID;
	}

	public ConsumerDetails getConsumerDetails() {
		return consumerDetails;
	}

	public void setConsumerDetails(ConsumerDetails consumerDetails) {
		this.consumerDetails = consumerDetails;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
