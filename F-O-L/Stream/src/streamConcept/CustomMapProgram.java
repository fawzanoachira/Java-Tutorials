package streamConcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product2{
	int id;
	String Name;
	double price;
	
	public Product2(int id, String name, double price) {
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

public class CustomMapProgram {
	public static void main(String[] args) {
		Product2 product = new Product2(1, "pen", 10);
		Product2 product2 = new Product2(2, "chocolate", 50);
		Product2 product3 = new Product2(3, "biscuit", 20);
		Product2 product4 = new Product2(4, "book", 45);
		Product2 product5 = new Product2(5, "pencil", 5);
		
		List<Product2> asList = Arrays.asList(product,product2,product3,product4,product5);
		
		List<Double> priceList = asList.stream().map((n)->n.price+10).collect(Collectors.toList());
		System.out.println(priceList);
		asList.stream().map((n)->n.price+10).forEach((n)->System.out.println(n));
		System.out.println();
		asList.stream().map((n)->n.price+10).forEach(System.out::println);
		
		System.out.println("-------------------------");
		
		//using both filter and map methods
		
		asList.stream().filter((n)->n.price<=20).map((n)->n.price+10).forEach(System.out::println);
		
		
	}
}
