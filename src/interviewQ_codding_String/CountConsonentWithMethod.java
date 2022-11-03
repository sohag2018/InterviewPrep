package interviewQ_codding_String;

import java.util.List;

public class CountConsonentWithMethod {

	public static void main(String[] args) {
		// method call
		String sentene = "My name is Sohag";

		for (int i = 0; i < sentene.length(); i++) {
			// System.out.println(sentene.charAt(i));
			if (sentene.charAt(i) != ' ' && sentene.charAt(i) != 'a' && sentene.charAt(i) != 'e'
					&& sentene.charAt(i) != 'i' && sentene.charAt(i) != 'u' && sentene.charAt(i) != 'o') {

				System.out.println(sentene.charAt(i));

			}
			
			
		}
		
		System.out.println();
		
		for (int i = 0; i < sentene.length(); i++) {
			// System.out.println(sentene.charAt(i));
			if (sentene.charAt(i) != ' ' && sentene.charAt(i) != 'a' && sentene.charAt(i) != 'e'
					&& sentene.charAt(i) != 'i' && sentene.charAt(i) != 'u' && sentene.charAt(i) != 'o') {

				System.out.println(sentene.charAt(i));

			}
			
			
		}
		
		
		

	}

}
