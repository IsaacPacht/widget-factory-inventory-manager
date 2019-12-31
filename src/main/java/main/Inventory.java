package main;
import java.util.ArrayList;
import java.util.List;

import products.Product;

public class Inventory {
	private final List<Product> products = new ArrayList<>();
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public boolean isProductInInventory(long id) {
		return findProduct(id) != null;
	}
	
	public Product findProduct(long id) {
		for (Product product : products) {
			if (product.getId() == id) {
				return product;
			}
		}
		
		return null;
	}
}
