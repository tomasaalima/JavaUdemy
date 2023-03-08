package sixtyNine_two;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Name: ");
			String nome = sc.next();
			System.out.println("Gross salary: ");
			Float salario_bruto = sc.nextFloat();
			System.out.println("Tax:");
			Float imposto = sc.nextFloat();
			
			Employee teste = new Employee(nome, salario_bruto, imposto);
			System.out.println(teste.toString());
			
			System.out.println("Which percentage  to increase salary?");
			Float incremento = sc.nextFloat();
			
			teste.salaryUpdate(incremento);
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Certifique-se de usar '.' para representar os valores com ponto flutuante");
		}
		
	}
}
