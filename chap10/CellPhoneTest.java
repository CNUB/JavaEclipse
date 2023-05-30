package chap10;

public class CellPhoneTest {

	public static void main(String[] args) {
		// Dmb 객체 생성
		DmbCellPhone dmb = new DmbCellPhone("java phone", "black", 10);
			
		
		// Dmb 클래스로부터 상속받은 필드
		System.out.println("model : " + dmb.model);
		System.out.println("color : " + dmb.color);
		
		// Dmb 클래스의 필드
		System.out.println("channel : " + dmb.channel);
		
		// CellPhone 클래스로부터 상속 받은 메소드 호출
		dmb.poweron();
		dmb.poweroff();
		dmb.bell();
		dmb.sendVoice("Hello");
		dmb.receiVoice("Yeah");
		dmb.hangUp();
		
		// dmb 클래스의 메소드 호출
		dmb.turnOnDmb();
		dmb.changeChannelDmg(0);
		dmb.turnOffDmb();
	}

}
