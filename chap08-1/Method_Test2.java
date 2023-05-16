
public class Method_Test2 {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("car start");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) { System.out.println("Don't need gas yet"); }
		else { System.out.println("need gas"); }
		
		myCar.keyTurnOn();
		myCar.run2();
		int speed = myCar.getSpeed();
		System.out.println(speed + "km/h");
	}

}
