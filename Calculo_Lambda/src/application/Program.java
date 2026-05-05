package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {
	public static int compareProducts(Product p1, Product p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}
	package app;

	import java.util.ArrayList;
	import java.util.List;

	import entities.Product;

	public class Program { 
	    public static void main(String[] args) {

	        List<Product> list = new ArrayList<>();
	        list.add(new Product("Tv", 900.00));
	        list.add(new Product("Mouse", 50.00));
	        list.add(new Product("Tablet", 350.50));
	        list.add(new Product("HD Case", 80.90));

	        list.removeIf(Product::staticProductPredicate);

	        for (Product p : list) {
	            System.out.println(p);
	        }
	    }
	}
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.sort(Program::compareProducts);
		list.forEach(System.out::println);
	}
}