package tr.com.ismailyavuz.javacourse.week5.interfacerunner;

public class Student implements Human {

	private String name;
	private int age;
	private double gpa;

	@Override
	public void introduce() {
		System.out.println("Hello my name is " + name + 
				" and my age is " + age + " and my gpa is " + gpa);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

}
