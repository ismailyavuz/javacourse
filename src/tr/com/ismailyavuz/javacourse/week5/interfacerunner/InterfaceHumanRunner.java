package tr.com.ismailyavuz.javacourse.week5.interfacerunner;

public class InterfaceHumanRunner {
	public static void main(String[] args) {

		//Interface
		Human human = new Student();
		human.setAge(34);
		human.setName("adem");
		human.introduce();

		Student student = new Student();
		student.setAge(34);
		student.setName("ismail");
		student.setGpa(57.0);
		student.introduce();

		Worker worker = new Worker();
		worker.setAge(43);
		worker.setName("Oduncu");
		worker.setSalary(23456);
		worker.introduce();

		Human workerButHuman = worker;

		workerButHuman.introduce();
		Human studentButHuman = student;
		studentButHuman.introduce();

		Retired retired = new Retired();
		retired.setAge(98);
		retired.setName("Mehmet emmi");
		retired.introduce();

		Human[] friends = new Human[3];
		friends[0] = student;
		friends[1] = worker;
		friends[2] = retired;

		for (Human insan : friends) {
			insan.introduce();
		}

	}
}
