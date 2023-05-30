package chap11;

class Person{
	String name;
	String age;
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person{
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}

public class CastTest2 {
	
	public static void main(String[] args) {
		Person p;
		Student s = new Student("Yee");
		// 자동 타입 변환 (upcasting)
		p = s;
		// student 객체가 person 타입으로 업캐스팅
		// student 클래스의 필드나 메소드에 접근 불가
		
	}

}
