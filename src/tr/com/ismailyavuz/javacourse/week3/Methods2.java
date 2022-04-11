package tr.com.ismailyavuz.javacourse.week3;

public class Methods2 {
	static void greeting(String name) {
		System.out.println("Hello friends! My name is " + name);
	}

	public static void main(String[] args) {
		greeting("ismail");
		String a = "nameless";
		greeting(a);
	}
}
