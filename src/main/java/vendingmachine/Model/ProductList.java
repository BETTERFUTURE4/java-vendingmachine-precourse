package vendingmachine.Model;

import java.util.ArrayList;

public class ProductList {
	private final ArrayList<Product> products = new ArrayList<>();

	public void add(Product product) {
		products.add(product);
	}

	public Product find(String name) {
		return products.stream()
			.filter(product -> product.NAME.equals(name))
			.findAny()
			.get();
	}

	public int getMinPrice() {
		return products.stream()
			.map(product -> product.PRICE)
			.max(Integer::compare)
			.get();
	}

	public String[] getNames() {
		return products.stream()
			.map(product -> product.NAME)
			.toArray(String[]::new);
	}

	public boolean allSoldOut() {
		return products.stream()
			.allMatch(product -> product.stock == 0);
	}
}