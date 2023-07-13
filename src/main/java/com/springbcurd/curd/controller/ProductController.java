package com.springbcurd.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbcurd.curd.customer.ProductDto;
import com.springbcurd.curd.service.ProductService;

@RequestMapping("/api/products")
@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	 
	@GetMapping("{id}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable("id") int Id){
        ProductDto productDto = productService.getProduct(Id);
        return ResponseEntity.ok(productDto);
    }
}
