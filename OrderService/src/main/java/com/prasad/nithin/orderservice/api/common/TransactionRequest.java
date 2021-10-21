/**
 * 
 */
package com.prasad.nithin.orderservice.api.common;

import com.prasad.nithin.orderservice.api.entity.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author nithinprasad
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

	private Order order;
	private Payment payment;
	
}
