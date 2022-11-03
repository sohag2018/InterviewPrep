package stringConstantPool;

public class SCP {

	
	/*
	 1. What is String Constant Pool?
	 2. Why String is immutable? Explain String Immutability?
	 3. tell me the diff between double equl operator (==) and equal()
	 4. after giving code --what will be the output?
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		int a=5;
		int b=5;
		
		a=5+1;
		
		String name1="Sohag";
		String name2="Sohag";
		
		name1.concat("h");
		
		
		System.out.println(name1);
		System.out.println(name2);
		
		
		
		System.out.println(name1==name2); 
		

	}

}
