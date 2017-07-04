import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//HDTV class creadeted
class HDTV{
	public String Brandname;
	public int Size;
	
	//constructor to set the values of the properties
	public HDTV(String brandname, int size) {
		
		Brandname = brandname;
		Size = size;
	}

	@Override
	public String toString() {
		return "HDTV [Brandname=" + Brandname + ", Size=" + Size + "]";
	}
}

//clas that contain the main method 
public class Task3 {
	
	//main method
	public static void main(String []args){
		
			//HDTV class object created
			HDTV tv1 = new HDTV("Sony",40);
			HDTV tv2 = new HDTV("Sony1",56);
			HDTV tv3 = new HDTV("Sony2",60);
		
			//Arraylist creaeted that ccan hold the HDTV object
			ArrayList<HDTV> list = new ArrayList<HDTV>();
			
			//HDTV object added to the arraylist
			list.add(tv1);
			list.add(tv2);
			list.add(tv3);
			list.add(tv1);
			list.add(tv2);
			
			System.out.println("All the element of the Arraylist");
			//Iterator created that can iterate thorugh all the elements of the arraylist
			 Iterator<HDTV> itr=list.iterator();  
			  //traversing elements of ArrayList object  
			  while(itr.hasNext()){  
			    HDTV st=(HDTV)itr.next();  
			    System.out.println(st.Brandname+" "+st.Size);  
			  }  
			  
			  
			  System.out.println("elements that are duplicate");
			  
			  //creatng set's object and adding the element to it 
			  
			  //as wwe know set dont accept the duplicate hence result false boolean and we will use it
			 Set<HDTV> set = new HashSet<>();
			 
			 for (HDTV tv:list){
				 if(set.add(tv)==false){
					 System.out.println(tv.Brandname+" "+tv.Size);
				 }
			 }
			 
			  
			  
			 
			  
	}
			 }   
	

