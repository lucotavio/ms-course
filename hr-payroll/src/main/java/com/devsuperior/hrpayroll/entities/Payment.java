package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private Double dailyincome;
	private Integer days;
	
	public double getTotal() {
		return days * dailyincome;
	}
	
}
