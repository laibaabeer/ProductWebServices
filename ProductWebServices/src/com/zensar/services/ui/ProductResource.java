package com.zensar.services.ui;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;
import com.zensar.services.business.ProductServiceImpl;

/*
 * Author: Laiba Khan
 * Creation Date: 26th July 2019 12.15PM
 * Modified Date: 26th July 2019 12.15PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved. 
 * Description: Product Web Service.
 * It provide product data through RESTful Web Service.  
 * */

@Path("/products")
public class ProductResource {

	private ProductService productService;
	
	public ProductResource() {
		// TODO Auto-generated constructor stub
		productService = new ProductServiceImpl();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Product> getAllProducts(){
		return productService.findAllProducts();
		
	}
}
