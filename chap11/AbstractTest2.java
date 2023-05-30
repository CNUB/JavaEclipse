package chap11;

abstract class Figure{
	abstract void draw();
}

class Triangle extends Figure{
	public void draw() { System.out.println("다형성 : 삼각형 그리기"); }
}

class Rectangle extends Figure{
	public void draw() { System.out.println("다형성 : 사각형 그리기"); }
}

class Oval extends Figure{
	public void draw() { System.out.println("다형성 : 타원형 그리기"); }
}

class Polydraw{ // 도형그리기 클래스
	// Figure 형의 객체를 매개변수로 그 객체의 draw()메소드 호출
	public void pdraw(Figure f) {
		f.draw();
	}
}

public class AbstractTest2 {

	public static void main(String[] args) {
		Polydraw p = new Polydraw();
		Figure fg1 = new Triangle(); // 추상클래스 형으로 객체 생성
		Figure fg2 = new Rectangle();
		Figure fg3 = new Oval();
		p.pdraw(fg1); // 동일 객체에 동일 메세지 보내기
		p.pdraw(fg2);
		p.pdraw(fg3);
		
	}

}
