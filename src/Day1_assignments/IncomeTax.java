package Day1_assignments;

public class IncomeTax {

	public static void main(String[] args) {

		// Condition 1

		int basic = 4000;
		int tax;
		int tax1;
		int tax2;
		int tax3;
		int tax4;
		if (basic <= 4000) {
			tax = (basic * 4) / 100;
			System.out.println("tax for 1st Conditons  " + tax); // 160
			if (basic <= 10000) {
				tax1 = (basic * 6) / 100;
				System.out.println("tax for 2nd Conditons  " + tax1); // 240
				if (basic <= 17000) {
					tax2 = (basic * 8) / 100;
					System.out.println("tax for 3rd Condtions   " + tax2); // 320
					if (basic <= 27000) {
						tax3 = (basic * 10) / 100;
						System.out.println("tax for 4th Conditions " + tax3); // 400

						if (basic <= 35000) {

							tax4 = (basic * 15) / 100;
							System.out.println("tax for 5th Conditions  " + tax4); // 600
						}
					}
				}
			}
		}
	}
}

//		
//		
//		
//	//Conditions 2
//		
//		int basic1=10000;
//		int tax1;
//		if(basic1<=10000) {
//			tax1=(basic1*6)/100;
//			System.out.println(tax1);       //600
//		}else {		
//			System.out.println("0");
//		  }
//		//Conditions 3
//		int basic2=17000;
//		int tax2;
//		if(basic2<=17000) {
//			tax2=(basic2*8)/100;
//			System.out.println(tax2);              //1360
//		}else {
//			System.out.println("tax2  is a null");
//		}
//		
//		//Conditions 4
//		int basic3=27000;
//		int tax3;
//		if(basic3<=27000) {
//			tax3=(basic3*10)/100;
//			System.out.println(tax3);
//		}else {
//			System.out.println("tax3 is null");
//		}
