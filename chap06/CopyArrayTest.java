package chap6;

public class CopyArrayTest {

	public static void main(String[] args) {
		int num1[] = {10, 20, 30};
		int num2[] = {40, 50, 60};
		
		num2 = num1; // num2에 num1 주소 넣는거임
		num2[2] = 200;
		
		System.out.print("num1 nalues : ");
		
		for(int i : num1) System.out.print(i + " ");
		
		System.out.print("num2 nalues : ");
		for(int i : num2) System.out.print(i + " ");
		
		int num3[] = {100, 200, 300};
		int num4[] = {400, 500, 600};
		
		for(int i = 0; i < num3.length; i++) {
			num4[i] = num3[i];
		}
	}
		

}
