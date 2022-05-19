package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += (grossSalary * percentage / 100);
	}
	
	public String toString() {
		return "Employee: "
				+ name
				+ "\nGross Salary: R$ "
				+ String.format("%.2f", grossSalary)
				+ "\nNet Salary: R$ "
				+ String.format("%.2f", netSalary());
	}
}
