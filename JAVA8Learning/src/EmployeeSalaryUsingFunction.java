import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeSalaryUsingFunction {
	
	public static void main (String args[]) {
		//Create a few employees and add them in an arraylist.
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Vishal",1,150000));
		empList.add(new Employee("Vishal",2,40000));
		empList.add(new Employee("Vishal",3,30000));
		empList.add(new Employee("Vishal",4,10000));
		empList.add(new Employee("Vishal",5,20000));
		
		
	   Function <ArrayList<Employee>, Double> totalSal = (list) -> {	double totalsal = 0;
		   																	for(Employee emp : list) {
		   																		totalsal += emp.salary;
		   																	}
																			return totalsal;
	   																   };
	System.out.println(totalSal.apply(empList));
	}

}
