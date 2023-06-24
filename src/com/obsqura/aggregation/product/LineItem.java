package com.obsqura.aggregation.product;

public class LineItem {
	int quantity;
	Product product;
	

	public LineItem(int quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}
	
	public void display() {
		System.out.println("Product details");
		System.out.println("Quantity" +" "+ quantity);
		System.out.println(product.id +" " + product.name +" "+ product.description);
	}


	public static void main(String[] args) {
		Product product1 = new Product(111,"Llyod","Split AC with Inverter");
		LineItem item = new LineItem(100,product1);
		item.display();
		

	}

}
