package sixtynine_two;

public class Employee {
	String name;
	Float gross_salary;
	Float tax;
	
	public Employee(String name, Float gross_salary, Float tax) {
		this.name = name;
		this.gross_salary = gross_salary;
		this.tax = tax;
	}
	
	public void salaryUpdate(float tax) {
		this.gross_salary *= 1 + (tax/100);
		System.out.println("Updated data:" + name + ", $ " + (gross_salary - this.tax));
	}
	
	@Override
	public String toString() {
		return "employee:" + name + ", $ " + (gross_salary - tax);
	}
}
