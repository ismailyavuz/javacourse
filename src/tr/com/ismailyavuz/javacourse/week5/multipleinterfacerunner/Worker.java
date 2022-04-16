package tr.com.ismailyavuz.javacourse.week5.multipleinterfacerunner;

public class Worker implements Human, Workable {

	private String name;
	private int age;
	private double salary;

	@Override
	public void introduce() {
		System.out.println("Hello my name is " + name 
				+ " and my age is " + age + " and my salary is " + salary);
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void work() {
		this.salary *=1.001;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
}
