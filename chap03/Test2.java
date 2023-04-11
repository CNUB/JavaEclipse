package chap03;

public class Test1 {
	
	public static void main(String[] args) {
		int var1 = 0b1011; // 2ì§„ìˆ˜
		int var2 = 0xB3; // 16ì§„ìˆ˜
		int var3 = 356; // 10ì§„ìˆ˜
		
		byte var4 = -128; // byte ? •?ˆ˜
		// byte var5 = 128; // ì»´íŒŒ?¼ ?—?Ÿ¬
		
		long var6 = 9223372036854775807L;	// ? •?ˆ˜ ë¦¬í„°?Ÿ´?´ int????…?˜ ?—ˆ?š© ë²”ìœ„ë¥? ?„˜?Š” ê²½ìš° L ë¶™ì´ê¸?
		
		char ch1 = 'A';
		char ch2 = 65;	 // 10ì§„ìˆ˜
		char ch3 = 0101; // 8ì§„ìˆ˜
		char ch4 = 0x41; // 16ì§„ìˆ˜
		char ch5 = '\u0041'; // ?œ ?‹ˆì½”ë“œ ê°’ìœ¼ë¡? ì§?? • ê°??Š¥
		
		String str1 = "kim";
		String str2 = "ABC\"DEF\"GHI"; // ?´?Š¤ì¼??´?”„ ë¬¸ì \"
		String str3 = "ABC\tDEF\tGHI"; // ?´?Š¤ì¼??´?”„ ë¬¸ì \t
		
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
