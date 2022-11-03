package interviewQ_codding_String;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Mukta";
		System.out.println(name.length());
		// System.out.println(name.charAt(0));

		// approach-1: Using reverse() which is available in StringBuffer and
		// StringBuilder

		// StringBuffer sbBuffer =new StringBuffer(name);
		StringBuilder sbBuilder = new StringBuilder(name);
//		System.out.println(sbBuilder);
//		System.out.println(sbBuilder.reverse());
		// converting back to String
		String newName = sbBuilder.toString();
		System.out.println(newName);

		// approach-2 charAt() and reverse looping

		for (int i = 4; i >= 0; i--) {

			System.out.print(name.charAt(i));
		}

		System.out.println("************/n");

		System.out.println("\noutput=kta notreverse but partial\n");
		for (int i = 2; i < name.length(); i++) {
			System.out.print(name.charAt(i));
		}

		System.out.println("\noutput=Muk notreverse but partial\n");
		for (int i = 0; i < name.length() - 2; i++) {
			System.out.print(name.charAt(i));
		}

	}

}
