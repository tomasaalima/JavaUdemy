package sixtyNine_one;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter rectangle width and height:");
			float largura = sc.nextFloat();
			float altura = sc.nextFloat();
			Rectangle teste = new Rectangle(largura, altura);
			System.out.println(teste.area());
			System.out.println(teste.perimeter());
			System.out.println(teste.diagonal());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Certifique-se de usar '.' para representar os valores com ponto flutuante");
		}
		
		sc.close();
	}
}
