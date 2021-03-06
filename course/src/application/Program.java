package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data");
		System.out.print("name: ");
		product.name = input.nextLine();
		System.out.print("Price: ");
		product.price = input.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.quantity = input.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = input.nextInt();
		product.addProduct(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = input.nextInt();
		product.removeProduct(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		
		input.close();

	}

}
