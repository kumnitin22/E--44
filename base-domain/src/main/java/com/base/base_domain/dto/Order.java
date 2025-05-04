package com.base.base_domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	 private String orderid;
	 
	 private String ordername;
	 
	 private int quantity;
	 
	 private double price;
	 
}
