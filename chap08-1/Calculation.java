/*
클래스 내부에서 메소드를 호출 할 경우에는 객체생성 안해도 된다
메소드 이름만으로 호출 가능
 */
public class Calculation {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("execution result : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
