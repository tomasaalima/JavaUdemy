package seventyTwo;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double amount(double dollar, double value) {
		return dollar * value * (1 + IOF);
	}
}
