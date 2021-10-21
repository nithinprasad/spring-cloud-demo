/**
 * 
 */
package com.prasad.nithin.paymentservice.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prasad.nithin.paymentservice.api.entity.Payment;

/**
 * @author nithinprasad
 *
 */
public interface PaymentRepository extends JpaRepository<Payment,String>{

}
