/*
두 개의 정수를 입력 받아 두 수 사이의 홀수값을 모두 더해 출력 

4		
5	5
6					
7	7				+ 2
8					
9	9				+ 4	
10	
11	11				+ 6
12
13	13				+ 8
14			

				   		//상승값		//홀수 갯수
min + 2 * 3 -> 6		2			3
min + 2 * 6 -> 12		3			4
min + 2 * 10 -> 20		4			5
min + 2 * 15 -> 30		5			6
min + 2 * 21 -> 42		6			7
min + 2 * 28 -> 56		7			8


odd = ((max - min) / 2)

min = 4, max = 10;
sum += (min + 1) * odd + (odd - 1) * odd
= (4 + 1) * ((10 - 4) / 2) + (((10 - 4) / 2) -1) * ((10 - 4) / 2)
= 5 * 3 + 2(상승값) * 3(홀수 갯수) = 21 

min = 4, max = 9;
sum += (min + 1) * (odd + 1) + odd * (odd + 1)
= (4 + 1) * (((9 - 4) / 2) + 1) + (((9 - 4) / 2)) * (((9 - 4) / 2) + 1)
= 5 * 3 + 2(상승값) * 3(홀수 갯수) = 21 


odd = ((max - min - 1) / 2);

min = 5, max = 10;
sum += min + (min * odd) + odd * (odd + 1)
= 5 + (5 * ((10 - 5 - 1) / 2)) + ((10 - 5 - 1) / 2) * ((10 - 5 - 1) / 2) + 1)
= 5 + (5 * 2) + 2 * 3 = 21
sum += maxb ? 0 : max; = 21


*/
package chap04;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수 입력");
		int num1 = stdIn.nextInt();	// 5		5
		int num2 = stdIn.nextInt();	// 10
		int sum = 0;
		
		int min = num1 > num2 ? num2 : num1;	// 최소값
		int max = num1 > num2 ? num1 : num2;	// 최대값
		
		boolean minb = min % 2 == 0 ? true : false;	// 시작값이 짝수인지 홀수인지
		boolean maxb = max % 2 == 0 ? true : false;	// 끝값이 짝수인지 홀수인지
		
		int odd = ((max - min) / 2);	// 홀수의 갯수
		
		if (minb) {	// 시작값이 짝수면
			if (maxb) sum += (min + 1) * odd + (odd - 1) * odd;		// 끝값이 짝수일 경우 min = 4, max = 10, (5 * 3 + 2 * 3) = 21 
			else sum += (min + 1) * (odd + 1) + odd * (odd + 1);	// 끝값이 홀수일 경우 min = 4, max = 9, (5 * 3 + 2 * 3) = 21
		}
		else { // 시작값이 홀수면
			odd = ((max - min - 1) / 2);	// 홀수의 갯수 min = 5, max = 10, (10 - 5 - 1) / 2 = 3
			sum += min + (min * odd) + odd * (odd + 1);	
			sum += maxb ? 0 : max;
		}
		System.out.print("홀수의 합 : " + sum);
		
	}

}
