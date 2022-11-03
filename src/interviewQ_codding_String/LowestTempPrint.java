package interviewQ_codding_String;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LowestTempPrint {

	public static void main(String[] args) {
		// Lets say you have 5 states and their temp
		//find out the  lowest temp
		
		
		
		Map<String, Integer> map=new HashMap<>();
		
		map.put("NY", 78);
		map.put("NJ", 68);
		map.put("CT", 88);
		map.put("PA", 58);
		map.put("CA", 100);
		
		
		int lowesttemp=100;
		String stateName=null;
		//System.out.println(map.keySet());
		Set<String> states= map.keySet();
		for(String state:states) {
			if(lowesttemp >map.get(state)) {
				stateName=state;
				lowesttemp=map.get(state);
				
			}
		}
		
		System.out.println("Lowes Temp: State-"+stateName+" Temp-"+lowesttemp);
		
		
	}

}
