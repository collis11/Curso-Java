package app;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Map <Product, Double> strock = new HashMap<>();
		
		Product p1 = new Product ("Tv", 900.0);
		Product p2 = new Product ("Notebook", 1200.0);
		Product p3 = new Product ("Tablet", 400.0);

		strock.put (p1, 10000.0);
		strock.put (p2, 20000.0);
		strock.put (p3, 15000.0);

		Product ps = new Product ("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + strock.containsKey(ps));
	}

}
