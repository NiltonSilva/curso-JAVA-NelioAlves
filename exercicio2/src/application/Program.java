package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Employee emp = new Employee();
		
		System.out.print("Enter with name: ");
		emp.name = input.nextLine();
		System.out.print("Enter with Gross Salary: ");
		emp.grossSalary = input.nextDouble();
		System.out.print("Enter with tax: ");
		emp.tax = input.nextDouble();
		
		System.out.println();
		System.out.println(emp);
		
		System.out.print("Wich percentage to increase salary? ");
		double percentage = input.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data\n" + emp);
		

		input.close();
	}

}
