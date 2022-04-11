package tr.com.ismailyavuz.javacourse.week4.human;

public class Student extends Human {
	double gpa;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	void introduce() {
		System.out.println("Hello my name is " + name + " and my age is " + age 
				+ " and my gpa is " + gpa);
	}
}
