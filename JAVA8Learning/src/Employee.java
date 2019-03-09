import java.util.ArrayList;
import java.util.Collections;

public class Employee {
	
	private String Name;
	private int Id;
	double salary;
	
	public Employee(String Name, int Id) {
	this.Id= Id;
	this.Name= Name;
	}
	
	public Employee(String Name, int Id,double sal) {
		this.Id= Id;
		this.Name= Name;
		this.salary=sal;
		}
		
	public String toString() {
		return Name + ":" + Id; 
		
	}
	
	public static void main (String args[]) {
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("vishal", 10));
		emp.add(new Employee("Umang", 30));
		emp.add(new Employee("anchal", 20));
		
		System.out.println("emp list without sorting ... "+ emp);
		//SOrting based on id.
		Collections.sort(emp, (emp1,emp2) -> {return (emp1.Id>emp2.Id) ? -1 : (emp1.Id<emp2.Id) ? 1 :0 ;});
		
		//After sorting
		System.out.println("emp list without sorting ... "+ emp);
	}
}
