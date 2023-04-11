/*
정수를 반복 입력 받아 정수의 합이 1000이상이 되면 1000을 넘은 수와 평균을 출력
 */
package chap05;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		int cnt = 0;
		
		while(true) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
			cnt++;
			sum += num;
			if (sum >= 1000) break;
		}
		System.out.print("평균 : " + sum / cnt + "\n1000을 넘은 수 : " + num);
	}
}
