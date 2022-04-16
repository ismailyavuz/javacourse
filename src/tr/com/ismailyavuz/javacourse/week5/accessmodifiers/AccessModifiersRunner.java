package tr.com.ismailyavuz.javacourse.week5.accessmodifiers;

public class AccessModifiersRunner {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.name = "ismail";
		c.balance = 21345;
		System.out.println(c.toString());
		
		c.balance = -3245;
		System.out.println(c);
		
		SafeCustomer customer = new SafeCustomer("ismail");
		customer.addDeposit(100000);
		System.out.println(customer.getName() + " has " + customer.getBalance());
		customer.withdraw(25000);
		System.out.println(customer.getName() + " has " + customer.getBalance());
		customer.withdraw(250000);
		System.out.println(customer.getName() + " has " + customer.getBalance());

		//GOTO ExceptionHandlingRunner
	}
}
