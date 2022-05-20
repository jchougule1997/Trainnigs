package Day4_assignments;

public class EnumDemo {

	public static void main(String[] args) {

		enumdata ed=enumdata.SUNDAY;
		
		//System.out.println(ed);
		
		
		enumdata [] eds=enumdata.values();
		for(enumdata week :eds) {
			System.out.println(week);
			System.out.println(week.ordinal());
		}
		
		
		
	}

}
