/*
메소드 재정이(Overriding)
하위클래스에서 상위 클래스의 메소드를 재정의 하면 상위 클래스의 메소드는 숨겨지고 재정의된 하위 클래스의 메소드만 사용
그러나 super키워드를 이용해서 부모 메소드 호출 가능
 */
package chap10;

public class Calculator {
	double areaCricle(double r) {
		System.out.println("areaCricle() 실행");
		return 3.14159 * r * r;
	}
}
