/**
 * 
 */
package com.prasad.nithin.orderservice.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.prasad.nithin.orderservice.api.common.Payment;
import com.prasad.nithin.orderservice.api.common.TransactionRequest;
import com.prasad.nithin.orderservice.api.common.TransactionResponse;
import com.prasad.nithin.orderservice.api.entity.Order;
import com.prasad.nithin.orderservice.api.repository.OrderRepository;

/**
 * @author nithinprasad
 *
 */
@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private RestTemplate template;
	
	public TransactionResponse saveOrder(TransactionRequest transactionRequest) {
		Payment payment=transactionRequest.getPayment();
		payment.setOrderId(transactionRequest.getOrder().getId());
		payment.setAmount(transactionRequest.getOrder().getPrice());
		
		Payment paymentRes= template.postForObject("http://PAYMENT-SERVICE/payment/doPayment", payment, Payment.class);
		Order orderRes= orderRepository.save(transactionRequest.getOrder());
		 return new TransactionResponse(orderRes,paymentRes.getTransactionId(),paymentRes.getAmount(),paymentRes.getPaymentStatus());
	}

}
