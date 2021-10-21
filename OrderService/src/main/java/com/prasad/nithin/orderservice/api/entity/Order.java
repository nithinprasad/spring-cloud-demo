/**
 * 
 */
package com.prasad.nithin.orderservice.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author nithinprasad
 *
 */
@Entity
@Table(name = "ORDER_TB")
@Data
public class Order {

	@Id
	private int id;
	private String name;
	private int qty;
	private double price;

}
