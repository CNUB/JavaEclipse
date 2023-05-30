/*
타입변환(자동타입 변환)
클래스의 타입 변환읜 상속관계에서 발생
자식은 부모 타입으로 자동타입 변환 가능
바로 위 부모가 아니더라도 상속 계층에서 상위 타입이면 자동 타입 변환 가능
타입변환(강제타입 변환
부모타입을 자식타입으로 변환
자식 타입이 부모 타입으로 형 변환 후 다시 자식 타입으로 변환 할 때만 사용 가능

instanceof 연산자
객체가 특정 클래스로부터 생성된 객체인지 판별 true. false로 변횐
object 클래스는 자바의 회상위 클래스
 */
package chap11;

class A{}

class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 상위 클래스 객체 변수에 하위 클래스에서 생성된 객체 배정 허용
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		// 상속관계가 아니므로 컴파일 에러 발생
		//B b3 = e;
		//C c2 = d;
	}

}
