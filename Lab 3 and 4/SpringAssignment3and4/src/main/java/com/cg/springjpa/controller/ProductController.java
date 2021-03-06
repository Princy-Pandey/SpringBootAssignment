package com.cg.springjpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springjpa.entity.Product;
import com.cg.springjpa.exception.ProductException;
import com.cg.springjpa.service.ProductServiceInterface;


@RestController
public class ProductController {

	@Autowired
	private ProductServiceInterface myService;

	@PostMapping("/product")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product) {

		Product pk = myService.save(product);

		return new ResponseEntity<Product>(pk, HttpStatus.OK);
	}

	@GetMapping("/getProducts")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> lb = myService.reterive();
		return new ResponseEntity<List<Product>>(lb, HttpStatus.OK);
	}
	
	@GetMapping("/delProduct/{id}")
	public ResponseEntity<Boolean> delProduct(@PathVariable("id") int id) {
		
		Boolean status = myService.delete(id);
		if(!status)throw new ProductException("Product not found.");   //Id is auto generated so I apply at the time of deletion if Id found delete otherwise throw exception  
		return new ResponseEntity<Boolean>(status, HttpStatus.OK);
	}
	
	
}
