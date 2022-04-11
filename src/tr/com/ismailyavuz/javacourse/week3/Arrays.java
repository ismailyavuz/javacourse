package tr.com.ismailyavuz.javacourse.week3;

public class Arrays {

	public static void main(String[] args) {
		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		cars[0] = "Opel";
		System.out.println(cars[0]);

		String thirdElement = cars[3];
		System.out.println(thirdElement);
		System.out.println(cars.length);

		int[] myNum = { 10, 20, 30, 40 };
		System.out.println(myNum[0]);
		System.out.println(myNum[1]);
		System.out.println(myNum[2]);
		myNum[3] += myNum[1];
		System.out.println(myNum[3]);
		
		int[] differentArray = new int[3];
		differentArray[0] = 0;
		differentArray[1] = 1;
		differentArray[2] = 4;
		
		//GOTO Loops

	}

}
