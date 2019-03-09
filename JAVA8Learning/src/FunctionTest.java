import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionTest {
	
	public static void main (String args[]) {
		
		String s = "abs";
		//function to remove white spaces.
		Function<String,String> f1 = str -> str.replaceAll(" ","");
		System.out.println(f1.apply("My Name is vishal"));
		Supplier<Date> sup = () ->  new Date();
		System.out.println(sup.get());
		//Add students in an arraylist.
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("vishal", 99));
		students.add(new Student("vishal1", 59));
		students.add(new Student("vishal2", 79));
		students.add(new Student("vishal3", 29));
		students.add(new Student("vishal4", 39));
		//Put grades.
		//Grade A --> if marks >= 90 , grade B if <90 and <=70 ,grade C if <70 and >=50 , else <50 Grdae D
		
		Predicate<Integer> gradeA = marks -> marks >= 90;
		Predicate<Integer> gradeB = marks -> (marks >= 70 && marks <90);
		Predicate<Integer> gradeC = marks -> (marks >= 50 && marks <70);
		Predicate<Integer> gradeD = marks -> marks < 50;
		Consumer<Student> c = stu -> {System.out.println("Student name is .. "+stu.name);};
		Function <Predicate<Integer>,ArrayList<Student>> gradeEdStudents  =    grade -> {ArrayList<Student> studentsGrade = new ArrayList<Student>();
																						 for(Student stu: students) {
																							 if(grade.test(stu.marks))
																								 studentsGrade.add(stu);
																						 	}
																						return studentsGrade;
																							 };
	  
   ArrayList<Student> gradeAStudents= gradeEdStudents.apply(gradeB);
	for(Student student : gradeAStudents) {
		c.accept(student);
	}
	
	
	}

}