package chap6;

import java.util.Scanner;


public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾고싶은 값 입력 : ");
		int n = sc.nextInt();
		
		int cnt = 0;
		int inum[] = {8,7,6,6,7,7,6,5,4,3,4,6,8,8,6};
		
		for (int i  = 0; i < inum.length; i++) {
			if (inum[i] == n) {
				System.out.println(i + "번째 값 : " + inum[i]);
				cnt++;
			}
		}
		System.out.print("데이터의 개수 : ");
		if (cnt == 0) System.out.print("없음");
		else System.out.print(cnt);
	}

}
