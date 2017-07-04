import java.util.ArrayList;
import java.util.Arrays;


public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//created a arraylist of integer and added the some integer to the arraylist
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		//looping through all the elements of the arraylist till the size of Arraylist
		for(int i=0;i<list.size();i++){
			if(list.get(i)%2==0){                        //chekc the no is even or not
				System.out.println(list.get(i));			//print the values of the arraylist
			}
		}
		
		
		
	}

}
