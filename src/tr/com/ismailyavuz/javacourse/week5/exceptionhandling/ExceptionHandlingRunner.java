package tr.com.ismailyavuz.javacourse.week5.exceptionhandling;

public class ExceptionHandlingRunner {
	public static void main(String[] args) {
		try {
			Customer customer = new Customer("ismail");
			customer.addDeposit(100000);
			System.out.println(customer.getName() + " has " + customer.getBalance());
			customer.withdraw(25000);
			System.out.println(customer.getName() + " has " + customer.getBalance());
			customer.withdraw(250000);
			System.out.println(customer.getName() + " has " + customer.getBalance());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Invalid operations! Aborted");
			System.exit(0);
		} 
		
		//GOTO InterfaceHumanRunner
	}
}
