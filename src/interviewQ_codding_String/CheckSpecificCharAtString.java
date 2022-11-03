package interviewQ_codding_String;

import java.util.Scanner;

public class CheckSpecificCharAtString {

	public static void main(String[] args) {
		// Suppose your name assigned to a String variable---write the program to print a specif char from the string
		
		System.out.println("write your name in lower cases");
		Scanner sc =new Scanner(System.in);
		String name=sc.next(); //mukta
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='k') {
				System.out.println(name.charAt(i));
			}
			
			
		}
		
		
		
		
	
		
		
		
		
		
		
		

	}

}
