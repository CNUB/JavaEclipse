package chap05;

import java.util.Scanner;

public class star4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 개수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n-i; j++) 
				System.out.print(" ");
			for(int k = 0; k < i*2+1; k++) 
				System.out.print("*");

			System.out.println();
		}
	}
}

