/**
 * 
 */
package com.prasad.nithin.paymentservice.api.service;

import java.util.UUID;

import org.hibernate.type.UUIDBinaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

import com.prasad.nithin.paymentservice.api.entity.Payment;
import com.prasad.nithin.paymentservice.api.repository.PaymentRepository;

/**
 * @author nithinprasad
 *
 */
@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
	
	public Payment doPayment(Payment payment) {
		
		payment.setTransactionId(UUID.randomUUID().toString());
		payment.setPaymentStatus(paymentProcessing());
		return paymentRepository.save(payment);
	}
	
	public String paymentProcessing() {
		return new Random().nextBoolean()?"sucess":"failure";
	}
	
}
