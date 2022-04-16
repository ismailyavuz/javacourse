package tr.com.ismailyavuz.javacourse.week5.abstractrunner;

public class Retired extends Human {

	boolean isRetired = true;

	@Override
	public void introduce() {
		System.out.println("I am retired, my name is " 
				+ name.substring(0, 3) + "...?");
	}
	
}
