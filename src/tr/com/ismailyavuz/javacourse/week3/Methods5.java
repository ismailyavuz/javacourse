package tr.com.ismailyavuz.javacourse.week3;

public class Methods5 {
	static int myMethod(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		System.out.println(myMethod(5, 3));
		int a = myMethod(10, 20);
		System.out.println(a);
		System.out.println();
	}
}
