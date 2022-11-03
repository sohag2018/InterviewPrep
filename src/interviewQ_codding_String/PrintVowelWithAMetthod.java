package interviewQ_codding_String;

public class PrintVowelWithAMetthod {

	public static void main(String[] args) {
		
		printVowels("Print all vowels from this sentence");   //

	}// m closing

	public static void printVowels(String sentece){
	
		
		for(int i=0;i<sentece.length();i++) {
			
			if(sentece.charAt(i)=='a'||sentece.charAt(i)=='e'||sentece.charAt(i)=='i'||sentece.charAt(i)=='o'||sentece.charAt(i)=='u') {
				
				System.out.println(sentece.charAt(i));
		}//if clsing
		
		}//loop clsing
		
		
	}//method closing
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
// class closing
