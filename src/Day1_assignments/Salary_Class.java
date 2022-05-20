package Day1_assignments;

public class Salary_Class {

	public static void main(String[] args) {

		
		int basic=15000;
		int DA=(basic*20)/100;
		System.out.println(DA);
		                                    //20/100
		int HRA=(basic*30)/100;
		System.out.println(HRA);
		
		
		int gross=basic+DA+HRA;
		System.out.println(gross);
	}

}
