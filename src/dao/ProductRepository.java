package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	public ProductRepository() {
		
		Product phone = new Product("P0001","iPhone12",1000000);
		phone.setDescription("6.1inch, 2532X1170 Super Retina XDR display, µà¾ó 12MP Ä«¸Þ¶ó");
		phone.setCategory("Smart Phone");
		phone.setMenufacturer("Apple");
		phone.setUnitPrice(1000);
		phone.setCondition("New");
		
		for(int i=0;i<3;i++) {
			listOfProducts.add(phone);

		}
	}
	
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
	public Product getProductById(String productId) {
		Product productById=null;
		
		for(int i=0;i<listOfProducts.size();i++) {
			Product product = listOfProducts.get(i);
			if(product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
}
