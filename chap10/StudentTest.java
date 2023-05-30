package chap10;

public class StudentTest {

	public static void main(String[] args) {
		Student std = new Student("홍길동", "1234-5678", 1);
		
		System.out.println("name : " + std.name);
		System.out.println("ssn : " + std.ssn);
		System.out.println("studentNo : " + std.studentNo);
	}

}
