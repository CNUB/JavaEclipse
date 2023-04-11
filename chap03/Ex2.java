/**
 * 윤년 계산 프로그램
 * 조건1 : 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년
 * 조건2 : 400으로 나누어 떨어지는 해도 윤년
 */

package chap03;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Input Year : ");
		int year = stdIn.nextInt();
		
		System.out.print(year + "년은 " + (year % 4 == 0 && year % 100 != 0 ? "윤년 입니다." : year % 400 == 0 ? "윤년 입니다." : "윤년이 아닙니다."));
	}

}


