package eightyOne;

public class Account {
	
	private final double RATE = 5.0;
	
	private long number;
	private String name;
	private double balance;
	
	public Account(long number, String name) {
		this.number = number;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Account = " + number + ", Holder = " + name + ", balance = $ " + balance;
	}

	public void deposit(double value) {
		setBalance(getBalance() + value);
	}
	
	public void withdrawn(double value) {
		setBalance(getBalance() - value - RATE);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getNumber() {
		return number;
	}
	
	
}
