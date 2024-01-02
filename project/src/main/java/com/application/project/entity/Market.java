package com.application.project.entity;


import org.springframework.stereotype.Component;

//import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

//@Entity
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@Component
public class Market {
@Id
	private int MarketId;
	private String MarketName;
	private long MarketContactNo;
	private String Item;
	
	@Override
	public String toString() {
		return "Market [MarketId=" + MarketId + ", MarketName=" + MarketName + ", MarketContactNo=" + MarketContactNo
				+ ", Item=" + Item + "]";
	}
	
	
}
