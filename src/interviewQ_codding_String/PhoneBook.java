package interviewQ_codding_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

	public static void main(String[] args) {
		// Create a phone book program. from keyboard contact name will passed....output will be number.	
		//Map----key=name (String) value=Number
		//map obj---put key value----
		//scanner use---name input as a key------get()---it will return con number
		
		
		Map<String, String> phonebook=new HashMap<>();
		
		phonebook.put("sohag", "976624");        
		phonebook.put("eshfak", "976626624");
		phonebook.put("mukta", "97874");
		phonebook.put("tahira", "79777");
		phonebook.put("rubel", "7422");
		phonebook.put("rezwan", "44442");
		
		/*
		 * put()--->hashCode()===gives hashcode/int number------modulas (17/16=1, reminder-1---this reminder will be the index
		 * 
		 * bucket=16,,,,,1 bucket contains few things (key, value, hashcode, nextnode)
		 * 
		 * 
		 * 0
		 * 1---(sohag,value, hashcode, nextcode_------(rezwan, value, hashcode, nextcode)
		 * 2
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		
		
		
		System.out.println("Enter name---");
		Scanner scanner=new Scanner(System.in);
		String name=scanner.next().toLowerCase();
		
		System.out.println(phonebook.get(name));
		
		/*
		 * get()----hashCode()---hashcode----equals()
		 * */
		
		

	}

}
