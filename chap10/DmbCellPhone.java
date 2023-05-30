package chap10;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("channel : " + channel + "DMB Start receiving broadcasts");
	}
	void changeChannelDmg(int channel) {
		this.channel = channel;
		System.out.println("channel : " + channel + " change");
	}
	void turnOffDmb() {
		System.out.println("DMG End of breadcast reception");
	}
}
