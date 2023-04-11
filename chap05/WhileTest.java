/*
정수 입력 받아 팩토리얼 값 구하기

 */
package chap05;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int fac = sc.nextInt();
		int facV = 1;
		
		while(fac > 1) {
			facV *= fac;
			fac--;
		}
		System.out.print("팩토리얼 : " + facV);
		
	}

}
