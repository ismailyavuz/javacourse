package tr.com.ismailyavuz.javacourse.week4;

public class LoopsContinue {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for (i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
	}
	
	//GOTO IntroToObjectOriented
}
