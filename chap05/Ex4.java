/*
두 개의 숫자를 입력 받아 두 숫자 사이의 홀수값을 모두 더하여 출력
변수 - num1, num2, sum

1. 두 정수 입력(num1, num2)
2. 선택문(if (num1 <= num2)
3.
 */
package chap05;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		
		if (num1 >= num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		for (int i = num1 ; i <= num2; i++ ) {
			if (i % 2 != 0) sum += i;
		}
		
		System.out.print("홀수의 합 : " + sum);
	}

}
