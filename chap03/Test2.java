package chap03;

public class Test1 {
	
	public static void main(String[] args) {
		int var1 = 0b1011; // 2진수
		int var2 = 0xB3; // 16진수
		int var3 = 356; // 10진수
		
		byte var4 = -128; // byte ?��?��
		// byte var5 = 128; // 컴파?�� ?��?��
		
		long var6 = 9223372036854775807L;	// ?��?�� 리터?��?�� int????��?�� ?��?�� 범위�? ?��?�� 경우 L 붙이�?
		
		char ch1 = 'A';
		char ch2 = 65;	 // 10진수
		char ch3 = 0101; // 8진수
		char ch4 = 0x41; // 16진수
		char ch5 = '\u0041'; // ?��?��코드 값으�? �??�� �??��
		
		String str1 = "kim";
		String str2 = "ABC\"DEF\"GHI"; // ?��?���??��?�� 문자 \"
		String str3 = "ABC\tDEF\tGHI"; // ?��?���??��?�� 문자 \t
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var6);
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
