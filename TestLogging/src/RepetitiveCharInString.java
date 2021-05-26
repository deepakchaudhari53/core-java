import java.util.HashMap;
import java.util.Map;


public class RepetitiveCharInString {
	
	public static void main(String[] args) {
		String s = "god is Great";
		char[] c= s.toCharArray();
		Map<Character, Integer> set = new HashMap<Character,Integer>();
		
		
		for(char ch:c){
			if(set.containsKey(ch)){
				set.put(ch, set.get(ch)+1);
			}
			else{
				set.put(ch, 1);
			}
		}
		
		for(Character ch1: set.keySet()){
			if(set.get(ch1)>0){
				System.out.println("character "+ch1+" appears "+ set.get(ch1)+ " times" );
				
			}
		}
		
	}

}
