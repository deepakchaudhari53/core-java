import java.util.HashSet;
import java.util.Set;


public class Test {
	
	public static void main(String[] args) {
		Set set = new HashSet<String>();
		set.add(2);
		set.add("Ketkee");
		set.add(23.45);
		set.add("Ketkee");
		System.out.println(set);
	}

}
