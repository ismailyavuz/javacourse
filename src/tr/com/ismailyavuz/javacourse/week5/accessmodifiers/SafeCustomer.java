package tr.com.ismailyavuz.javacourse.week5.accessmodifiers;

public class SafeCustomer {
	// immutable
	private String name;

	// Only addDeposit/withdraw methods can change this
	private double balance;

	public SafeCustomer(String name) {
		this.name = name;
	}

	public void addDeposit(double amount) {
		if (amount <= 0) {
			System.out.println("Warn! Invalid amount to deposit!");
			return;
		}
		System.out.println(name + " deposited " + amount);
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount <= 0 || amount > balance) {
			System.out.println("Warn! Invalid amount to withdraw!");
			return;
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

	@Override
	public String toString() {
		return "SafeCustomer [name=" + name + ", balance=" + balance + "]";
	}

}
