package tr.com.ismailyavuz.javacourse.week5.exceptionhandling;

public class Customer {
	
	private String name;
	private double balance;

	public Customer(String name) {
		this.name = name;
	}

	public void addDeposit(double amount) {
		if(amount <= 0) {
			throw new RuntimeException("Warn! Invalid amount to deposit!");
		}
		System.out.println(name + " deposited " + amount);
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount <= 0 || amount > balance) {
			throw new RuntimeException("Warn! Invalid amount to withdraw!");
		}
		System.out.println(name + " withdrawed " + amount);
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}
}
