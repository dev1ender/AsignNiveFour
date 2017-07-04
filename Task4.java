import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1= new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
		Set<Integer> set2= new HashSet<Integer>(Arrays.asList(6,7,8));
		System.out.println("These are the element of the set1 initially");
		for (int a : set1){
			
			System.out.print(a+" ");
			
		}
		System.out.println();
		System.out.println("These are the element of set2");
		//iterate through all the object of set2 and addinf them to set 1
		for(int a: set2){
			 set1.add(a);
			 System.out.print(a+" ");
		}
		
		System.out.println();
		//printing the value of set1
		System.out.println("These are the element of the set1 now");
		for (int a : set1){
			
			System.out.print(a+" ");
			
		}
	}
	

}
