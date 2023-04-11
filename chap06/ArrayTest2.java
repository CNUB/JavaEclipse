package chap6;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0, avg;
		double dnum[] = new double[5];
		System.out.println("dnum 배열 길이 : " + dnum.length);
		
		System.out.print("초기화 하지 않은 dnum[]값 : ");
		
		for(int i = 0; i < dnum.length; i++) System.out.print(dnum[i] + " ");

		System.out.println();
		
		for(int i = 0; i < dnum.length; i++) {
			System.out.print("dnum[" + (i + 1) + "] 번째 데이터 입력 : ");
			dnum[i] = sc.nextDouble();
			sum += dnum[i];
		}
		
		System.out.println("합계 : " + sum);
		System.out.print("평균 : " + sum / dnum.length);
	}
}
