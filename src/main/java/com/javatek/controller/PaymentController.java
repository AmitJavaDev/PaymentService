package com.javatek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatek.entity.Payment;
import com.javatek.service.PaymentService;

@RestController
@RequestMapping("/pay")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment payment) {
		
		return paymentService.doPayment(payment);			
		
		
	}

	// added comment in branch1 
	
}
