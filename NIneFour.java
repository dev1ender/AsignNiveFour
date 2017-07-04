import java.util.Comparator;
import java.util.TreeSet;


//Created Employee class and added constructor and getter and setter methods for private properties
class Employee{
	private String name;
	private String  designation;
	private int salary;
	public Employee(String name, String designation, int salary) {
		
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
}

//Mycomp class created by implementing the comparator interface  for tree set comparator object
class Mycomp implements Comparator<Employee>{

	//orriden method
	public int compare(Employee e1, Employee e2) {
		
		if(e1.getSalary()>e2.getSalary()){											//comapring salarry of the two treeset element
			return 1;
		}
		else if(e1.getSalary() == e2.getSalary()){									//if salary is same we will go for comparing name
			if(e1.getName().equals(e2.getName())){						
				return e1.getDesignation().compareTo(e2.getDesignation());			//if name is same we will we comapre and retun compare by  designation
			}
			else		
			return e1.getName().compareTo(e2.getName());							//eslse we will return compare by name 
		}
		return -1;
	}

	
	
	
}



//class that have main method inside it
public class NIneFour {
	//main method 
	public static void main(String[] args) {
			
		//created 7 objects of emplouyee class
		Employee emp1 = new Employee("Amit","Manager",50000);
		Employee emp2 = new Employee("Rahul","Sub-Manager",40000);
		Employee emp3 = new Employee("Vivek","Sub-Manager",40000);
		Employee emp7 = new Employee("Vivek","Developer",40000);
		Employee emp4 = new Employee("Amit","SuperVisor",35000);
		Employee emp5 = new Employee("Kg","Developer",30000);
		Employee emp6 = new Employee("Dev","DataAnalyist",40000);
		
		
		//created treeset of type employee which will compare on the baisis of mycomp class
		TreeSet<Employee> Emp = new TreeSet<Employee>(new Mycomp());
		
		//added Employee object to the treeset list
		Emp.add(emp1);
		Emp.add(emp2);
		Emp.add(emp3);
		Emp.add(emp4);
		Emp.add(emp5);
		Emp.add(emp6);
		Emp.add(emp7);
		
		//printing the elements of treeset
		for(Employee e:Emp){
			System.out.println(e);
		}
		
		
	}

}
