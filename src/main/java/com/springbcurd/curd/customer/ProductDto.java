package com.springbcurd.curd.customer;

public class ProductDto {
	  private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductDto(Product product) {
		super();
		this.product = product;
	}

	public ProductDto() {
		
	}
	    
	  
}
