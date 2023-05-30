/*
추상클래스
공통부분을 추출 후 추상 클래스 작성
무엇ㅇ인지만 정의, 어떻게는 하위 클래스에서 정의
추상메소드 - 추상클래스 내에 정의/선언만 있고 구현은 없음
객체 생성 안됨
 */
package chap11;

abstract class Shape1{
	abstract void draw();
	abstract void Area(double a, double b);
}

class Rectangle1 extends Shape1{
	void draw() {
		System.out.println("사각형");
	}
	void Area(double h, double v) {
		System.out.println("사각형의 넓이 : " + (h * v));
	}
}
class Triangle1 extends Shape1{
	void draw() {
		System.out.println("삼각형");
	}
	void Area(double a, double h) {
		System.out.println("삼각형의 넓이 : " + ((a * h)/ 2));
	}
}


public class Abstraction {

	public static void main(String[] args) {
		Shape1 s = new Rectangle1(); // 업 캐스팅
		s.draw();
		s.Area(5.0, 10.0);
		s = new Triangle1();
		s.draw();
		s.Area(5.0, 10.0);
	}

}
