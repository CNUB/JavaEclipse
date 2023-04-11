package chap03;

public class FloatDoubleTest {
	public static void main(String[] args) {
		// 실수 값 저장
		float var1 = 3.14f;	// float 자료형은 f 붙여줘야됨
		double var2 = 3.14;	// 더블은 안붙여도 됨
		
		// 정밀도
		float var3 = 0.12345678901234567890f;
		double var4 = 0.12345678901234567890;
		
		double var5 = 3e6;	// 3 * 10^6
		double var6 = 2e-3; // 2 * (1 / 10)^3
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
	}
}
