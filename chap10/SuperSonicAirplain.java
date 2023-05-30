package chap10;

public class SuperSonicAirplain extends Airplain{
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NOMAL;
	
	//Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("개빠른 비행");
		}
		else {
			super.fly();
		}
	}
	
}
