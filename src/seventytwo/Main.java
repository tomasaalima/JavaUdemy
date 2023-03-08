package seventyTwo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("What is the dollar price? ");
			double dollarPrice =  sc.nextDouble();
			System.out.println("How many dollars will be bought? ");
			double dollars = sc.nextDouble();
			System.out.printf("Amount to be paid in Reais =  %.2f", CurrencyConverter.amount(dollarPrice, dollars));
			
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Certifique-se de usar '.' para representar os valores com ponto flutuante");
		}
		
	}

}
