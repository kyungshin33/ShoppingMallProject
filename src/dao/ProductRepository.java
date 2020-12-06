package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}
	public ProductRepository() {
		
		Product phone = new Product("P0001","iPhone12",1000000);
		phone.setDescription("6.1inch, 2532X1170 Super Retina XDR display, µà¾ó 12MP Ä«¸Þ¶ó");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitPrice(1000000);
		phone.setUnitsInStock(100);
		phone.setCondition("New");
		phone.setFilename("iphone12.jpg");
		
		Product notebook = new Product("P0002","LG PC gram",1500000);
		notebook.setDescription("13.3inch, IPS LED display, 5rd Generation Intel Core processors");
		notebook.setCategory("NoteBook");
		notebook.setManufacturer("LG");
		notebook.setUnitPrice(1500000);
		notebook.setUnitsInStock(100);
		notebook.setCondition("Refurbished");
		notebook.setFilename("gram.jpg");
		
		Product tablet = new Product("P0003","Galaxy Tab 5",900000);
		tablet.setDescription("212.9*125.6*6mm, Super AMOLED display, Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitPrice(900000);
		tablet.setUnitsInStock(100);
		tablet.setCondition("Old");
		tablet.setFilename("tab5.jpg");
		
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
	public void addProduct(Product product) {
		listOfProducts.add(product);
		listOfProducts.add(product);
		listOfProducts.add(product);
	}
}
