/*
메소드 선언시 리턴ㄱ밧이 있는 경우 반드시 리턴문을 사용해서 리턴값을 지정해야 한다.
return문 이후의 실행문은 결코 실행되지 않는다
return값이 없는 메소드의 리턴 타입은 void
void로 선언된 메소드에서 return문은 메소드를 강제종료 시키는 역할을 한다.
 */
public class Car {
	int gas;
	int speed;
		
	void setGas(int gas) { this.gas = gas; }
		
	int getSpeed() { return speed; }
	
	void keyTurnOn() { System.out.println("\nTurn the key;"); }
	
	void run2() {
		for(int i = 10; i<=50; i+= 10) {
			speed=i;
			System.out.println("speed : " + speed + "km/h");
		}
	}
	boolean isLeftGas() {
		if(gas==0) { 
			System.out.println("no gas");
			return false;
		}
		else {
			System.out.println("has gas");
			return true;
		}
	}
		
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("run.(reamaining gas : " + gas + ")");
				gas-=1;
			}
			else {
				System.out.println("run.(reamaining gas : " + gas + ")");
				return;
			}
		}
	}
	
}
