package tr.com.ismailyavuz.javacourse.week4.student;

public class StudentRunner {

	private static void introduceStudent(Student student) {
		System.out.println(
				"Hello my name is " + student.name + " and my age is " 
						+ student.age + " and my gpa is " + student.gpa);
	}

	public static void main(String[] args) {
		//Class, instance, object, fields
		Student cem = new Student();
		cem.name = "cem";
		cem.age = 18;
		cem.gpa = 82.1;

		Student student2 = new Student();
		student2.name = "can";
		student2.age = 20;
		student2.gpa = 20.15;

		introduceStudent(cem);
		introduceStudent(student2);
		
		//Object arrays
		Student[] students = new Student[3];
		students[0] = cem;
		students[1] = student2;
		students[2] = new Student();
		students[2].name = "ismail";
		students[2].age = 82;
		students[2].gpa = 99;
		introduceStudent(students[2]);
		
		//Classes can have methods
		StudentIntroduceable studentIntroducable = new StudentIntroduceable();
		studentIntroducable.age = cem.age;
		studentIntroducable.name = cem.name;
		studentIntroducable.gpa = cem.gpa;
		studentIntroducable.introduce();
		
		//Constructors
		StudentIntroducableFromOldStudent studentIntroducableFromOldStudent1 
		= new StudentIntroducableFromOldStudent("nameIs", 34, 65);
		
		StudentIntroducableFromOldStudent s = new StudentIntroducableFromOldStudent();
		
		StudentIntroducableFromOldStudent studentIntroducableFromOldStudent 
		= new StudentIntroducableFromOldStudent(cem);
		studentIntroducableFromOldStudent.introduce();
	
		//GOTO HumanRunner
	}
}
