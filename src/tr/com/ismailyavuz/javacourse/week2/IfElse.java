package tr.com.ismailyavuz.javacourse.week2;

public class IfElse {
	public static void main(String[] args) {
		
//		if
		if (20 > 18) {
			System.out.println("20 is greater than 18");
		}
		
		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
		}
		
//		else
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
//		else if
		time = 8;
		if (time < 20) {
		  System.out.println("Good morning.");
		} else if (time < 10) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		
		//GOTO Arrays
	}
}
