package chap04;

import java.util.Scanner;
public class ForTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = stdIn.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			if(i % num == 0) sum += i;
		}
	}

}
