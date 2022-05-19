package entities;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double exibirNotaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double aprovadoOuReprovado() {
		if(exibirNotaFinal() < 60) {
			return 60 - exibirNotaFinal();
		} else {
			return 0;
		}
	}
	
}
