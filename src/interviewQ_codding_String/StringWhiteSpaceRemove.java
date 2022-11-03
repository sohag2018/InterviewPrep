package interviewQ_codding_String;

import javax.lang.model.element.NestingKind;

public class StringWhiteSpaceRemove {

	public static void main(String[] args) {
		String senString = "My name is Sohag";
		
		//approach-1: using replaceAll() with regex \\s for white space
		String newString=senString.replaceAll("\\s", "");
		System.out.println(newString);
		

		for (int i = 0; i < senString.length(); i++) {

			if (senString.charAt(i) != ' ') {
				System.out.print(senString.charAt(i));
			}
		}

	}

}
