package vendingmachine.Model;

public class Product {
	public final String NAME;
	public final int PRICE;
	public int stock;

	public Product(String name, int price, int stock) {
		NAME = name;
		PRICE = price;
		this.stock = stock;
	}

	public void sell() {
		stock--;
	}
}
