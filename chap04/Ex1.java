/**
 * 두 개의 정수를 입력 받아 두 수 사이의 홀수값을 모두 더해 출력
 * 
 * 5	
 * 6
 * 7	7
 * 8
 * 9	9
 * 10
 */
package chap04;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int num1 = stdIn.nextInt();
		int num2 = stdIn.nextInt();
		if((num1 == 7 || num1 == 8) && (num2 >= 40 && num2 <= 49)) System.out.print("80%");
		if((num1 == 5 || num1 == 6) && (num2 >= 50 && num2 <= 59)) System.out.print("100%");
		else System.out.print("X");
	}

}
