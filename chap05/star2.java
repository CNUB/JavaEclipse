package chap05;

import java.util.Scanner;

public class star2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 개수 입력 : ");
		int n = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

	}

}
