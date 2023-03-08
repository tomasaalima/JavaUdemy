package sixtyNine_three;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String name = sc.next();
			float one = sc.nextFloat();
			float two = sc.nextFloat();
			float three = sc.nextFloat();
			
			Student teste = new Student(name, one, two, three);
			
			teste.result();
			
			sc.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
