package tr.com.ismailyavuz.javacourse.week4;

public class IntroToObjectOriented {
	public static void main(String[] args) {

		String[] names = { "cem", "can", "mert", "ali", "veli" };
		int[] ages = { 18, 20, 41, 32, 26 };
		double[] gpas = { 82.1, 20.15, 93.78, 32.94, 66.76 };

		for (int i = 0; i < ages.length; i++) {
			System.out.println(names[i] + " is " + ages[i] + " years old");
		}
	}
	
	//GOTO StudentRunner
}
