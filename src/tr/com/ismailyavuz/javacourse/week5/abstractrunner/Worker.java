package tr.com.ismailyavuz.javacourse.week5.abstractrunner;

public class Worker extends Human {
	double salary;

	@Override
	public void introduce() {
		System.out.println("Hello my name is " + name + " and my age is " + age + 
				" and my salary is " + salary);
	}
}
