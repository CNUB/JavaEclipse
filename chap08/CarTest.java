package chap08;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("현재 속도 : " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("현재 속도 : " + myCar.speed);

	}

}
