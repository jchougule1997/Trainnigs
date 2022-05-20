package Day3_assignments;



class abc{
	static abc obj=new abc();
	private abc() {
		
	}
	public static abc getobj() {
		return obj;
	}
}
public class singleton {

	public static void main(String[] args) {

		abc obj=abc.getobj();
		
	}

}
