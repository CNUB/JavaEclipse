/*
2023 04 18
202095023 김주안

null과 NullPointExeption
참조변수의 --연산과 equals()메소드
 */
package chap6;

public class ArrayReference2 {

	public static void main(String[] args) {
		//int[] intArray = null;
		//intArray[0] = 10; // 참조객체가 없으므로 Nullpointexception
		
		String strVal1 = "java";
		String strVal2 = "java";
		
		if(strVal1 == strVal2) 
			System.out.print("strVal1 == strVa2 (같은 객체)");
		else
			System.out.print("strVal1 != strVa2 (다른 객체)");
		
		if(strVal1.equals(strVal2))
			System.out.print("strVal1 == strVa2 (같은 값)");
		
		String strVal3 = new String("mklee");
		String strVal4 = new String("mklee");
		
		if(strVal3 == strVal4) 
			System.out.print("strVal3 == strVa4 (같은 객체)");
		else
			System.out.print("strVal3 != strVa4 (다른 객체)");
		
		if(strVal3.equals(strVal4))
			System.out.print("strVal3 == strVa4 (같은 값)");
	}

}
