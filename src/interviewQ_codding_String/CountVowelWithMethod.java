package interviewQ_codding_String;

import java.security.PublicKey;

public class CountVowelWithMethod {

	public static void main(String[] args) {
		
		printVowelCount("Sohag");
		
	}
			
		public static void printVowelCount(String name) {
			int count=0;
			
			
		
		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == 'a'||name.charAt(i) == 'e'||name.charAt(i) == 'i'||name.charAt(i) == 'o'||name.charAt(i) == 'u')  {

				count++;
			} // if clsing

		} // loop clsing
		
		System.out.println(count);
		
		
	}

}
