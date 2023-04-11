package chap04;


import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Input Score : ");
		int score = stdIn.nextInt();
		
		if(score >= 90) System.out.println("PASS");
		else System.out.println("NON PASS");
		
		System.out.print("ㅊㅊ");
	}

}
