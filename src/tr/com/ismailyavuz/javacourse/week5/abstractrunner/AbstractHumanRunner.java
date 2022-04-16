package tr.com.ismailyavuz.javacourse.week5.abstractrunner;

public class AbstractHumanRunner {
	public static void main(String[] args) {

		//Abstract Class
		Human human = new Student(); //Can not use new Human()
		human.age = 34;
		human.name = "adem";
		human.introduce();

		Student student = new Student();
		student.age = 34;
		student.name = "ismail";
		student.gpa = 57.0;
		student.introduce();
		
		Worker worker = new Worker();
		worker.age = 43;
		worker.name = "Oduncu";
		worker.salary = 23456;
		worker.introduce();
		
		Human workerButHuman = worker;

		workerButHuman.introduce();
		Human studentButHuman = student;
		studentButHuman.introduce();
		
		Retired retired = new Retired();
		retired.age = 98;
		retired.name = "Mehmet emmi";
		retired.introduce();
		
		Human[] friends = new Human[3];
		friends[0] = student;
		friends[1] = worker;
		friends[2] = retired;
		
		for(Human insan : friends) {
			insan.introduce();
		}
		
	
	}
}
