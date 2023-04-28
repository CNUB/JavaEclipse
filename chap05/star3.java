package chap05;

import java.util.Scanner;
public class star3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 개수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
