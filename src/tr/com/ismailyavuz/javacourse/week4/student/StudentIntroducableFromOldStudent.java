package tr.com.ismailyavuz.javacourse.week4.student;

public class StudentIntroducableFromOldStudent {
	String name;
	int age;
	double gpa;
	int birthYear;
	
	//NoArgsConstructor
	StudentIntroducableFromOldStudent() {
		System.out.println("StudentIntroducableFromOldStudent executed!");
	}

	StudentIntroducableFromOldStudent(String name, int age, double gpa) {
		this.name = name;
		this.age = age;
		this.gpa = gpa;
		birthYear = 2022-age;
	}
	
	StudentIntroducableFromOldStudent(Student student) {
		this.name = student.name;
		this.age = student.age;
		this.gpa = student.gpa;
	}

	void introduce() {
		System.out.println("Hello my name is " + name + " and my age is " + age 
				+ " and my gpa is " + gpa);
	}
	
}
