/**
 * 
 */
package com.prasad.nithin.orderservice.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.nithin.orderservice.api.common.Payment;
import com.prasad.nithin.orderservice.api.common.TransactionRequest;
import com.prasad.nithin.orderservice.api.common.TransactionResponse;
import com.prasad.nithin.orderservice.api.service.OrderService;

/**
 * @author nithinprasad
 *
 */
@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	

	@PostMapping("/bookOrder")
	private TransactionResponse bookOrder(@RequestBody TransactionRequest transactionRequest) {
		return orderService.saveOrder(transactionRequest);
		
	}
}
