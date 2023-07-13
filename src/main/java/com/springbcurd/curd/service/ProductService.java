package com.springbcurd.curd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springbcurd.curd.customer.Product;
import com.springbcurd.curd.customer.ProductDto;
import com.springbcurd.curd.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	public ProductRepository productRepository;
	@Autowired
	private RestTemplate restTemplate;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public ProductDto getProduct(int Id) {
		ProductDto productDto = new ProductDto();
        ResponseEntity<Product> responseEntity = restTemplate
                .getForEntity("http://192.168.60.48:8081/api/products" + Id,Product.class);
        
        Product pd = responseEntity.getBody();

        System.out.println(responseEntity.getStatusCode());

        
        productDto.setProduct(pd);

        return productDto;
	}

	
}
