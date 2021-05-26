import java.util.HashSet;
import java.util.Set;


public class UniqueCharInString {
	
	public static void main(String[] args) {
		String s= "God is great";
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++){
			set.add(s.charAt(i));
		}
		System.out.println(set.size());
		System.out.println(set);
	}

}
