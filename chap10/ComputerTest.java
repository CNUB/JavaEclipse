package chap10;

public class ComputerTest {

	public static void main(String[] args) {
		int r = 10;
		
		// calculator 객체의 원의 넓이
		Calculator cal = new Calculator();
		System.out.println("(cal)circle Area : " + cal.areaCricle(r));
		
		
		// computer 객체의 원의 넓이
		Computer com = new Computer();
		System.out.println("(com)circle Area : " + com.areaCricle(r));
	}
}
