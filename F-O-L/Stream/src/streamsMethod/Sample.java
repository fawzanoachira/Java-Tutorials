package streamsMethod;

import java.util.Arrays;
import java.util.List;

class Product {
	int id;
	String Name;
	int price;
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		Name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + ", price=" + price + "]";
	}
}

public class Sample {
	public static void main(String[] args) {
		Product p1 = new Product(1, "a15", 15000);
		Product p2 = new Product(2, "a70", 20000);
		Product p3 = new Product(3, "s20", 30000);
		
		List<Product> list = Arrays.asList(p1,p2,p3);
		
		list.parallelStream().filter(product->product.price>16000).forEach(System.out::println);	
		
	}
}
