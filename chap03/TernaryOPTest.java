package chap03;

import java.util.Scanner;

public class TernaryOPTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("first integer : ");
		int num1 = stdIn.nextInt();
		
		boolean flag;
		flag = (num1 % 2 == 0) ? true : false;
		System.out.print("num1 is even number? : " + flag);
		

	}

}
