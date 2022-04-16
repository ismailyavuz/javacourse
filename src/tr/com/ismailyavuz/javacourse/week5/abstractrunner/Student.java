package tr.com.ismailyavuz.javacourse.week5.abstractrunner;

public class Student extends Human {
	double gpa;
	
	public Student() {
	}

	@Override
	public void introduce() {
		System.out.println("Hello my name is " + name + " and my age is " + age 
				+ " and my gpa is " + gpa);
	}
}
