/*
202095023 김주안

Array 클래스 - System.arraycopy(str1, 0, str2, 0, len)
			 str배열의
 */
package chap6;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		int num1[] = {10, 20, 30};
		int num2[] = {40, 50, 60};
		String str3[] = {"java", "array", "copy"};
		String str4[] = new String[5];	//str4는 null로 초기화
		
		for(int i = 0; i < num1.length; i++) 
			System.out.print(i + " ");
		
		System.out.print("\nnum2 value : ");
		for(int i : num2) // num2 출력 (10, 20, 30)
			System.out.print(i + " ");
		
		//System.arraycopy()로 복사
		System.arraycopy(str3, 0, str4, 0, 3);
		
		System.out.print("\nstr4 value : ");
		
		for(String value : str4) // str4 출력 (java, array, copy, null, null )
			System.out.print(value + " ");
		
		String str5[] = Arrays.copyOf(str3,  2); //str3 배열의 인덱스 0~길이 2만큼 str5에 복사
		
		System.out.print("\nstr5 value : ");
		for(String value : str5)
			System.out.print(value + " ");
	}

}
