package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		Product product = new Product ();
		System.out.println("enter produc data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock:");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.printf("Product data:" + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added int stock: ");
		
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.printf("Updated data:" + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.printf("Updated data:" + product);

		
		
		sc.close();
	}

}
