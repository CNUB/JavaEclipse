/*
정수를 입력받아 1~100까지의 정수중 입력받은 정수의 배수의 합을 구하기
 */
package chap05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int i = 0;
		int sum = 0;
		
		while(i <= 100) {
			i++;
			if (i % num == 0) sum += i;
			else continue;
		}
		System.out.print("배수의 합계 : " + sum);
	}

}
