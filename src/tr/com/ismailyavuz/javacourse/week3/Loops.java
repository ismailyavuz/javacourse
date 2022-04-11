package tr.com.ismailyavuz.javacourse.week3;

public class Loops {
	public static void main(String[] args) {
		
		/**
*
**
***
****
		 
		 
		 */
		
		int input = 4;
		for(int i = 0; i<input; i++ ) {
			for(int j = 0; j<=i;j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		}

		for (int j = 0; j < 5; j++) {
			System.out.print(j);
		}

		do {
			System.out.println(i);
			i++;
		} while (i < 5);

		for (int ii = 0; ii <= 10; ii = ii + 2) {
			System.out.println(ii);
		}

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

//		for (int j = 0; j < cars.length; j++ ) {
//			System.out.println(cars[j]);
//		}

		for (int ii = 0; ii <= 10; ii++) { //ii = 1
			for (int jj = ii; jj <= 10; jj++) {// jj = 1
				System.out.print("ii=" + ii); //ii=0 ii=0 ii = 1
				System.out.print(" jj=" + jj);// jj=0 jj=1 jj = 10 jj = 1 jj = 2
				System.out.println();
			}
		}

		for (String currentCar : cars) {
			System.out.println(currentCar);
		}

//		GOTO HWDiamond

	}
}
