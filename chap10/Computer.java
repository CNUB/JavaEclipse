package chap10;

public class Computer extends Calculator{
	// Override
	double areaCricle(double r) {
		System.out.println("areaCricle() 실행");
		return Math.PI * r * r;
	}
}
