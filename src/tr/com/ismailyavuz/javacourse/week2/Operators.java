package tr.com.ismailyavuz.javacourse.week2;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {

//		Arithmetic Operators

//		addition
		int sum1 = 100 + 50; // 150 (100 + 50)
		int sum2 = sum1 + 250; // 400 (150 + 250)
		int sum3 = sum2 + sum2; // 800 (400 + 400)
		System.out.println(sum3);

//		subtraction
		int sub1 = 100 - 50; // 50 (100 - 50)
		int sub2 = sub1 - 50; // 0 (50 - 50)
		int sub3 = sub1 - sub2; // 50 (50 - 0)
		System.out.println(sub3);
		
//		multiplication
		int mul1 = 5 * 10; // 50 (5 * 10)
		int mul2 = mul1 * 2; // 100 (50 * 2)
		int mul3 = mul2 * mul2; // 10000 (100 * 100)
		System.out.println(mul3);

//		division
		int payint = 22;
		double pay = payint; //type casting
		double div1 = pay / 7; // 20 (1000 / 50)
//		int div2 = div1 / 2; // 10 (20 / 2)
//		int div3 = div1 / div2; // 2 (20 / 10)
//		System.out.println(div3);

//		modulus
		int mod1 = 45 % 4; // 1 (45 % 4)
		System.out.println(mod1);

//		increase decrease by one (shorthand)
		int inc = 3;
		inc++; // inc = inc+1 = 3 + 1 = 4;
		System.out.println(inc);
		inc--; // inc = inc-1 = 4 - 1 = 3;
		System.out.println(inc);

		int num1 = 10;
		num1 += 12; // num1 = num1 + 12 = 10 + 12 = 22
		System.out.println(num1);

		num1 *= 2; // num1 = num1 * 2 = 22 * 2 = 44;
		System.out.println(num1);

		num1 /= 2; // num1 = num1 / 2 = 44 * 2 = 22;
		System.out.println(num1);

		num1 %= 5; // num1 = num1 % 5 = 22 % 5 = 2;
		System.out.println(num1);

//		concatenate strings
		String a = "First";
		String b = " Second";
		String c = " Third";
		System.out.println(a + b + c); // First Second Third
		
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);
		
		String ten = "10";
		String twenty = "20";
		String res = ten + twenty;   // z will be 1020 (a String)
		System.out.println(res);
		
//		Java Comparison Operators
		boolean isFiveGreaterThanThree = 5 > 3;
		System.out.println(isFiveGreaterThanThree);

		int x, y;
		x = 3;
		y = 1;
		boolean isYGreaterThanX = x < y;
		System.out.println(isYGreaterThanX);

		boolean isXEqualToY = x == y;
		System.out.println(isXEqualToY);

		boolean isXDifferentFromY = x != y;
		System.out.println(isXDifferentFromY);

		boolean isXGreaterThanOrEqualTo3 = x >= 3;
		System.out.println(isXGreaterThanOrEqualTo3);

//		Java Logical Operators
//		AND
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

//		OR
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
//		NOT
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		
		
		//Operator Precedence
		
		int xx = 5 + 2 - 1; //6
		xx = 5 * 2 + 1 / 1; //11
		xx = 5 * (2 + 1) / 1; //15
		int yy = ++xx; 
		yy = 5 + x;

		//GOTO IfElse

	}
}
