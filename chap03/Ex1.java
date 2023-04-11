/**
 * 동전 교환
 * 입력된 액수만큼 500, 100, 50, 10원짜리 동전으로 교환
 * 조건1 : 동전의 총 갯수 최소화
 * 조건2 : 고액의 동전 우선 교환
 */

package chap03;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Input money : ");
		int money = stdIn.nextInt();
		
		System.out.println("500 : " + money / 500);
		money %= 500;
		System.out.println("100 : " + money / 100);
		money %= 100;
		System.out.println("50 : " + money / 50);
		money %= 50;
		System.out.println("10 : " + money / 10);
		money %= 10;
		
	}

}
