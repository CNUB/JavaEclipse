/*
메소드 이름은 자비 식별자 규칙에 맞게 작성
관례적으로 소문자로 작성
$,_ 제외한 특수문자 사용 불가
매게변수-메소드가 실행할 때 필요한 데이터를 외부에서 받기 위해 사용
(1) 매개변수의 개수를 알 수 있는 경우
(2)매개변수의 개수를 모를 경우-배열 타입으로 건언
*/
class Calculator{
		void powerOn() { System.out.println("power on"); }
		
		int plus(int x, int y) {
			int result = x + y;
			return result;
		}
		double divide(int x, int y) {
			double result = (double)x / (double)y;
			return result;
		}
		
		void powerOff() { System.out.println("power off"); }
		
		int sum1(int[] values) { // 매개변수의 갯수를 모를 경우
			int sum = 0;
			for(int i = 0; i<values.length; i++) {
				sum+=values[i];
			}
			return sum;
		}
		
		int sum2(int... values) {	// 매개변수의 갯수를 모를 경우
			int sum = 0;
			for(int i = 0; i<values.length; i++) {
				sum+=values[i];
			}
			return sum;
		}
	}
public class Method_Test1 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.powerOn();
		
		int result1 = cal.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		
		double result2 = cal.plus(x, y);
		System.out.println("result2 : " + result2);
		
		int[] value1 = {1, 2, 3};
		int result3 = cal.sum1(value1);
		System.out.println("result3 : " + result3);
		
		int result4 = cal.sum2(new int[] {1,2,3,4,5});
		System.out.println("result4 : " + result4);
		
		int result5 = cal.sum2(1, 2, 3);
		System.out.println("result5 : " + result5);
		
		cal.powerOff();
	}

}
