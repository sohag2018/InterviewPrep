package interviewQ_codding_String;

public class OrAndLogic {

	public static void main(String[] args) {
		String name1="A";
		String name2="E";
		

		
		if(name1=="A"|| name2=="E") {
			System.out.println("Consonennt");
		}
		
		if(name1=="A"&& name2=="E") {
			System.out.println("Consonennt");
		}
		
		
		if(name1!="A"&& name2!="E") {
			System.out.println("Consonennt"); //if boolean false then it will be executed 
		}
		
		if(name1!="A"|| name2!="E") {
			System.out.println("Consonennt");
		}
		

	}

}
