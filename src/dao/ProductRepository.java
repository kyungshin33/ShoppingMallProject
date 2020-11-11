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
		
		Product notebook = new Product("P0002","LG PC gram",1500000);
		phone.setDescription("13.3inch, IPS LED display, 5rd Generation Intel Core processors");
		phone.setCategory("NoteBook");
		phone.setMenufacturer("LG");
		phone.setUnitPrice(1000);
		phone.setCondition("Refurbished");
		
		Product tablet = new Product("P0003","Galaxy Tab 5",900000);
		phone.setDescription("212.9*125.6*6mm, Super AMOLED display, Octa-Core processor");
		phone.setCategory("Tablet");
		phone.setMenufacturer("Samsung");
		phone.setUnitPrice(1000);
		phone.setCondition("Old");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);

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
