package interviewQ_codding_String;

import javax.lang.model.element.NestingKind;

public class vowelPrint {

	public static void main(String[] args) {
		String senString="My name is Sohag";
		
		int count=0;
		
		for(int i=0;i<senString.length();i++) {
			
			if(senString.charAt(i)=='a'||senString.charAt(i)=='e'||senString.charAt(i)=='i'||senString.charAt(i)=='o'||senString.charAt(i)=='u') {
			
				count++;
			
				
			}
		}
		
		System.out.println(count);
		
	}

}
