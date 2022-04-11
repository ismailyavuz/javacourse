package tr.com.ismailyavuz.javacourse.week4.human;

public class Worker extends Human {
	double salary;

	@Override
	void introduce() {
		System.out.println("Hello my name is " + name + " and my age is " + age + 
				" and my salary is " + salary);
	}
}
