package streamConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String Name;
	double price;
	
	public Product(int id, String name, double price) {
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

public class Sample2 {
	public static void main(String[] args) {
		
		Product product = new Product(1, "pen", 10);
		Product product2 = new Product(2, "chocolate", 50);
		Product product3 = new Product(3, "biscuit", 20);
		Product product4 = new Product(4, "book", 45);
		Product product5 = new Product(5, "pencil", 5);
		
		List<Product> list = new ArrayList<Product>();
//		List<String> longName = new ArrayList<String>();
		list.add(product);
		list.add(product2);
		list.add(product3);
		list.add(product4);
		list.add(product5);
		
		List<Product> newList = list.stream().filter((p)->p.price>=10).collect(Collectors.toList());
		System.out.println(newList);
	}
}
