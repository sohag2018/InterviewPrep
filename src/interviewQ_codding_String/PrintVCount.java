package interviewQ_codding_String;

public class PrintVCount {

	public static void main(String[] args) {
		
		System.out.println(printNumberOfVowels("We are looking for Vowels"));
		

	}// m closing

	public static int printNumberOfVowels(String sentece){
		
		int count=0;
		
		for(int i=0;i<sentece.length();i++) {
			
			if(sentece.charAt(i)=='a'||sentece.charAt(i)=='e'||sentece.charAt(i)=='i'||sentece.charAt(i)=='o'||sentece.charAt(i)=='u') {
				
				count++;
		}//if clsing
		
		}//loop clsing
		
		return count;
	}//method closing
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
// class closing
