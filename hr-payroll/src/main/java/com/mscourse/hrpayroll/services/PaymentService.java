package com.mscourse.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.mscourse.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("Worker Number 13", 265.00, days);
	}
}