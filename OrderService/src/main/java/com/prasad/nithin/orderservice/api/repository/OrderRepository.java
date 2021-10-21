package com.prasad.nithin.orderservice.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prasad.nithin.orderservice.api.entity.Order;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Integer>{

}
