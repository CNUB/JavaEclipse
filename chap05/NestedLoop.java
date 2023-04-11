/*
입력받은 숫자만큼 줄 수를 반복하면서 직각 삼각형 출력
 */
package chap05;

import java.util.Scanner;

public class NestedLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
