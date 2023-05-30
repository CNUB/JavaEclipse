package Test;
import java.util.Scanner;

abstract class Calc{
	abstract void calc(int x, int y);
	abstract void calc(double x, double y);
}

class Add2 extends Calc{
	@Override
	public void calc(int x, int y) {
		System.out.println("덧셈 : " + (x + y));
	}

	@Override
	void calc(double x, double y) {
		System.out.println("덧셈 : " + (x + y));
	}
}

class Div2 extends Calc{
	@Override
	public void calc(double x, double y) {
		System.out.println("나눗셈 : " + (x / y));
	}

	@Override
	void calc(int x, int y) {
		System.out.println("나눗셈 : " + (x / y));

	}
}

class Mul2 extends Calc{
	@Override
	public void calc(double x, double y) {
		System.out.println("곱셈 : " + (x * y));
	}

	@Override
	void calc(int x, int y) {
		System.out.println("곱셈 : " + (x * y));
	}
}

class Sub2 extends Calc{
	@Override
	public void calc(int x, int y) {
		System.out.println("뺄셈 : " + (x - y));
	}
	@Override
	void calc(double x, double y) {
		System.out.println("뺄셈 : " + (x - y));	
	}
}


public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		String op;
		
		Calc add = new Add2();
		Calc sub = new Sub2();
		Calc mul = new Mul2();
		Calc div = new Div2();
		
		System.out.print("두 정수 연산자 입력 : ");
		x = sc.nextInt();
		y = sc.nextInt();
		op = sc.next();
		
		switch(op) {
			case "+":

				add.calc(x, y);
				break;
			case "-":
				sub.calc(x, y);
				break;
			case "*":
				mul.calc(x, y);
				break;
			case "/":
				div.calc(x, y);
				break;
			default:
				break;
			
		}

	}

}
