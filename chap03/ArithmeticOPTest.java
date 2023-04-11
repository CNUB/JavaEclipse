package chap03;

public class ArithmeticOPTest {

	public static void main(String[] args) {
		int a = 5, b = 2;
		int sum = a + b;
		int mod = a % b;
		int c = ++a;	// 전위 연산
		int d = b++;	// 후위 연산
		
		System.out.println("a + b = " + sum);
		System.out.println("a % b = " + mod);
		System.out.println("++a = " + c);
		System.out.println("a = " + a);
		System.out.println("b++ = " + d);
		System.out.println("b = " + b);
	}

}
