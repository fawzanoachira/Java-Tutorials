package enum_package;

enum DAYS{
	MONDAY,
	TUESDAY,
	WEDNWSDAY,
	THURSDAY, 
	FRIDAY, 
	SATURDAY,
	SUNDAY
}

enum DIRECTIONS{
	NORTH,EAST,WEST,SOUTH
}

public class Enum {
	public static void main(String[] args) {
		DAYS text = DAYS.FRIDAY;
		System.out.println(text);
		
		System.out.println("----------------------");
		
		DAYS[] d = DAYS.values();
		
		for(int i = 0; i<=d.length-1; i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("-----------------------");
		
		DIRECTIONS[] values = DIRECTIONS.values();
		
		for(DIRECTIONS d1:values) {
			System.out.println(d1);
		}
		
		System.out.println("-------------------------");
		
		DIRECTIONS valueOf = DIRECTIONS.valueOf("WEST");
		System.out.println(valueOf);
	}
}
