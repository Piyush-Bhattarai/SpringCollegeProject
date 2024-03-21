package com.springproject.model;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="product_tbl")
public class Product {
	
	private int id;
	private String title;
	private int price;
	private String img;
	
	@CollectionTable
	@ElementCollection
	List<Product> cartitems;

}
