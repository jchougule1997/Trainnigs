package Day4_assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSum {

	public static void main(String[] args) {

		
		
		String str="3wel5come7To9Java6";
		
		Pattern p=Pattern.compile("[0-9]");        //java.util.regex.pattern
		
		Matcher m=p.matcher(str);                //java.util.regex.matcher
		
		int sum=0;
		while(m.find()) {
			sum=sum+Integer.parseInt(m.group());
		}
		System.out.println("sum of the strig numbers :  "+sum);         //3+5+7+9+6
	}

}
