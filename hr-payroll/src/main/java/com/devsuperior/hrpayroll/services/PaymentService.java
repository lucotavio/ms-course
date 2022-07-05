package com.devsuperior.hrpayroll.services;

import org.springframework.stereotype.Service;
import com.devsuperior.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(long workerId,int days) {
		Payment payment = Payment.builder()
				                 .name("Bob")
				                 .dailyincome(200.0)
				                 .days(days)
				                 .build();
		return payment;
	}
}
