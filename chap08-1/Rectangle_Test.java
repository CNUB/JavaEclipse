
public class Rectangle_Test {

	public static void main(String[] args) {
		Rectangle cal = new Rectangle();
		
		double result1 = cal.areaRectangel(10);
		double result2 = cal.areaRectangel(10, 20);

		System.out.print("정사각형" + result1);
		System.out.print("직사각형" + result2);
	}

}
