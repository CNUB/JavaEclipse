/*
202095023 김주안
두 숫자를 입력 받아 두 수 사이의 합계 출력
*/

package chap05;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		int temp;
		
		if (num1 >= num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for (int i = num1 ; i <= num2; i++ ) sum += i;
		
		System.out.print("합계 : " + sum);
		
		

	}

}