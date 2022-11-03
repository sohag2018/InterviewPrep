package interviewQ_codding_String;

public class StringModify {

	public static void main(String[] args) {
		String name="Mukta";
		
		//give me the output: Mukta Kazi	
		System.out.println(name.concat(" Kazi"));
		
		//if we print name variable then what will be output==still Mukta
		
		
		//if you dont refer (dont assin in any ref varibale name.concate(" Kazi") --what will happen
		//name.concat(" Kazi");-----------will be collected by finalize()
		
		
		String name1="Rafiz";
		
		//can you ptiny Rafez insted of Rafiz
		System.out.println(name1.replace(name1.charAt(3),'e'));
		
		
		
		String name2="Rifiz";
		System.out.println(name2.replace('i', 'e'));  //it will change all e
		
		System.out.println(name2.chars());
		
		
	}

}
