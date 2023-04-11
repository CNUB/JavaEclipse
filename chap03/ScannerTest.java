package chap03;

import java.util.Scanner;
public class ScannerTest {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("first integer : ");
		int num1 = stdIn.nextInt();	// 첫 번째 정수 저장
		
		System.out.print("Second integer : ");
		int num2 = stdIn.nextInt();	// 두 번째 정수 저장
		
		double avg1 = (num1 + num2) / 2;
		double avg2 = (num1 + num2) / 2.0;
		double avg3 = (num1 + num2) / (float)2;
		
		System.out.println(num1);
		System.out.println(num2);
		
		System.out.println(avg1);
		System.out.println(avg2);
		System.out.println(avg3);
	}

}
