package enum_package;

public enum Level {
	LOW,MEDIUM,HIGH;
	public static void main(String[] args) {
		Level[] values = Level.values();
		for(Level lvl:values) {
			System.out.println(lvl);
		}
	}
}
