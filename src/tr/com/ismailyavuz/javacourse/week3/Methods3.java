package tr.com.ismailyavuz.javacourse.week3;

public class Methods3 {

	//signature: name, parameters in order
	static void myMethod(String name, int age) {
		System.out.println(name + " is " + age + " years old");
	}

	public static void main(String[] args) {
		myMethod("ismail", 30);
		myMethod("Java", 2022 - 1995);

	}

}
