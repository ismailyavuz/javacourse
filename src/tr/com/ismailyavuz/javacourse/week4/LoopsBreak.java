package tr.com.ismailyavuz.javacourse.week4;

public class LoopsBreak {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for (i = 0; i < 10; i++) {
			sum += i;
			if (sum > 10) {
				break;
			}
		}
		System.out.println(i);

		while (true) {
			sum = 0;
			for (i = 0; i < 10; i++) {
				sum += i;
				if (sum > 10) {
					break;
				}
			}
			System.out.println(i);
		}
	}

	// GOTO LoopsContinue
}
