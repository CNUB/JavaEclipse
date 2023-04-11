/*
입력받은 숫자의 약수를 모두 출력
변수 - num
32 = 32 16 8 4 2 1
33 = 33 11 3 1
*/
package chap05;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0) System.out.println("약수 : " + i);
		}
	}

}
