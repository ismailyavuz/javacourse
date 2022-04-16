package tr.com.ismailyavuz.javacourse.week5.multipleinterfacerunner;

public class MultipleInterfaceRunner {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("ismail");
		student.setAge(14);
		student.setGpa(34);
		student.learn("interfaces in Java");
		student.introduce();
		
		Worker worker = new Worker();
		worker.setName("Ali");
		worker.setAge(48);
		worker.setSalary(4567);
		worker.introduce();
		worker.work();
		System.out.println(worker);
		worker.work();
		worker.work();
		worker.work();
		worker.work();
		worker.work();
		worker.work();
		worker.work();
		worker.work();
		worker.work();
		System.out.println(worker);
	}
}
