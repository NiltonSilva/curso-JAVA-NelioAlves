package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Informe o nome: ");
		student.name = input.nextLine();
		System.out.print("Informe a primeira nota: ");
		student.nota1 = input.nextDouble();
		System.out.print("Informe a segunda nota: ");
		student.nota2 = input.nextDouble();
		System.out.print("Informe a terceira nota: ");
		student.nota3 = input.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.exibirNotaFinal());
		
		if(student.exibirNotaFinal() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.aprovadoOuReprovado());
		} else {
			System.out.println("PASS");
		}
		
		input.close();

	}

}
