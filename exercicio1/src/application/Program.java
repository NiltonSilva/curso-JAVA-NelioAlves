package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.print("Enter with width: ");
		rec.width = input.nextDouble();
		System.out.print("Enter with height: ");
		rec.height = input.nextDouble();
		
		System.out.println(rec);
		
		input.close();
	}

}
