package chap03;

import java.util.Scanner;

public class ShiftOPTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("first integer : ");
		int num1 = stdIn.nextInt();	// 첫 번째 정수 저장
		
		System.out.print("Second integer : ");
		int num2 = stdIn.nextInt();	// 두 번째 정수 저장
		
		System.out.println("num1 = " + num1 + "(" + Integer.toBinaryString(num1) + ")");
		System.out.println("num2 = " + num2 + "(" + Integer.toBinaryString(num2) + ")");
		
		System.out.println("num1 << 2 = " + (num1<<2) + "(" + Integer.toBinaryString(num1<<2) + ")");
		System.out.println("num1 >> 2 = " + (num1>>2) + "(" + Integer.toBinaryString(num1>>2) + ")");
		
		System.out.println("num2 << 2 = " + (num2<<2) + "(" + Integer.toBinaryString(num2<<2) + ")");
		System.out.println("num2 >> 2 = " + (num2>>2) + "(" + Integer.toBinaryString(num2>>2) + ")");
	}

}
