package java_intermediate;

class Whatsappv1{
	void chat() {
		System.out.println("Chat");
	}
	void settings() {
		System.out.println("Settings");
	}
}

class Whatsappv2 extends Whatsappv1{
	@Override
	void chat() {
		super.chat();
		System.out.println("Audiocall");
		System.out.println("Videocall");
		System.out.println("status");
		System.out.println("channels");
	}
	@Override
	void settings() {
		super.settings();
		System.out.println("New Policies");
		System.out.println("New Policies v2");
	}
}

public class Whatsapp{
	
	public static void main(String[] args) {
		Whatsappv2 m = new Whatsappv2();
		
		m.chat();
		m.settings();
	}
}
