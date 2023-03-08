package eightyOne;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter Account number: ");
			long number = sc.nextLong();
			System.out.println("Enter Account holder: ");
			String name = sc.next();
			System.out.println("Is there a initial deposit (y/n)? ");
			char choice = sc.next().charAt(0);
			
			Account teste = new Account(number, name);
			
			if(choice == 'y') {
				System.out.println("Enter initial deposit value: ");
				teste.deposit(sc.nextDouble());
				System.out.println("Account Data:\n"+teste.toString());
			}
			
			while(true) {
				boolean toContinue = true;
				
				System.out.println("1 - Deposit\n2 - Withdraw\n0 - Exit");
				int path = sc.nextInt();
				
				switch (path) {
				case 1: {
					System.out.println("Enter a deposit value: ");
					teste.deposit(sc.nextDouble());
					System.out.println("Account Data:\n"+teste.toString());
					break;
				}
				case 2: {
					System.out.println("Enter a withdraw value: ");
					teste.withdrawn(sc.nextDouble());
					System.out.println("Account Data:\n"+teste.toString());	
					break;
				}
				case 0: {
					toContinue = false;
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);
				}
				if(toContinue == false) {
					break;
				}
			}
			
			sc.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Algo deu errado, revise os dados fornecidos");
		}
	}

}
