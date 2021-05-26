import java.util.ArrayList;
import java.util.List;


public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,4,5,6,7,8};
		testArray(arr);
	}

	private static void testArray(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		int sum=0;
		double average = 0.0;
	
		for(int i=2;i<arr.length;i++){
			if(isPrimeNumber(i)){
				System.out.println("Array index:; "+i);
				list.add(arr[i]);
			}
		}
		
		
		for(int j = 0;j<list.size();j++){
			sum+=list.get(j);
		}
		average = sum/(list.size());
		System.out.println("Average:: "+average);
		
		
	}
	 private static boolean isPrimeNumber(int number){
		 
		
         
	        for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
	     
}
