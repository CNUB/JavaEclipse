package chap10;

public class SuperSonicAirplainTest {

	public static void main(String[] args) {
		SuperSonicAirplain ssa = new SuperSonicAirplain();
		
		ssa.takeOff();
		ssa.fly();
		ssa.flyMode=SuperSonicAirplain.SUPERSONIC;
		ssa.fly();
		ssa.flyMode=SuperSonicAirplain.NOMAL;
		ssa.fly();
		ssa.land();
	}

}
