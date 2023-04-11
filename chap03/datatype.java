package chap03;

public class Datatype {
	
	public static void main(String[] args) {
		/*
		 * 128을 8비트에 저장하면 부호비트가 1이 되고 나머지는 0이 됨
		 * 부호가 1이므로 음수를 취급하여 2의 보수를 구하기 위해 반전
		 * 부호비트가 1이므로 음수로 취급하여 -128이 된다
		 */
		byte a = (byte)128;	// byte = 127
		System.out.println("128을 저장한 byte 값 : " + a);
		byte b = (byte)256;
		System.out.println("256을 저장한 byte 값 : " + b); // 9비트가 필요하기 때문에 0
		
		
		// 실수형
		float f = 3.14f; // float형은 실수값의 끝에 f를 붙여야함
		double d1 = 3.14;
		double d2 = 3.14d; // double형은 실수값의 끝에 d를 붙여도 되고 안붙여도 됨 
		
		
		// 정밀도
		float f1 = 12345678901234567890.0f;
		double d3 = 12345678901234567890.0;
		
		System.out.println("float : " + f1);
		System.out.println("double : " + d3);
		
		// 상수
		final int MAX = 100;
		final double PI;
		PI = 3.14;	// 한 번 초기화 하면 변경 불가 
		
		// 형식 지정자
		System.out.printf("%d\n", 1234);
		System.out.printf("%+d\n", 1234);	// +를 사용해 부호를 지정
		System.out.printf("%10d\n", 1234);	// 출력 폭을 지정, 오른쪽 정렬
		System.out.printf("%010d\n", 1234);	// 출력 폭과 0을 지정, 오른쪽 정렬 후 0을 채움
		System.out.printf("-10%d\n", 1234);	// 출력 폭을 지정, 왼쪽 정렬
		System.out.printf("-+10%d\n", 1234);
		System.out.printf("%d\n", -1234);	// 음수 출력
		System.out.printf("10%d\n", -1234);	// 출력 폭을 지정, 오른쪽 정렬
		System.out.printf("-10%d\n", -1234);
		System.out.printf("#10o%d\n", 1234);// 8진수
		System.out.printf("#10X%d\n", 1234);// 16진수 대뮨자
		System.out.printf("#10x%d\n", 1234);// 16진수 소문자
	}
}
