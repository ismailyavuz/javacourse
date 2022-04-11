package tr.com.ismailyavuz.javacourse.week2;

public class variables {
	public static void main(String[] args) {

		String myName;
		myName = "ismail"; //literal
		System.out.println(myName);
		myName = "Unknown";
		System.out.println(myName);
		System.out.println(myName);

		int myAge = 30;
		System.out.println(myAge);
		myAge = 31;
		System.out.println(myAge);

		boolean iLoveJava = true;
		System.out.println(iLoveJava);
		iLoveJava = false;
		System.out.println(iLoveJava);

		String ismail = myName;
		myName = "abc";
		ismail = myName;
		System.out.println(ismail);

		final double PI = 3.14;
//		PI = 3wedrtu ;

		// casings
		System.out.println("ThisIsPascalCasing");// PascalCasing is used for Class names

		System.out.println("thisIsCamelCasing");// camelCasing is used for variable names

		// multiple variables in a single line
		int a = 5, b = 4, c = 5;
		System.out.println(a + b + c);
		
		//GOTO Operators

	}
}
