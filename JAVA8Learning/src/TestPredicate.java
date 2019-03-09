import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class TestPredicate {
	
	 
	 public static void main(String args[]) {
		 //Checkif number is greater than 10
		 Predicate<Integer> p = I-> I<10;
		 System.out.println(p.test(100));

		 //Checkif number is even
		 Predicate<Integer> pEven = I-> I%2==0;
		 System.out.println(pEven.test(20));
		 
		 //Check length of string.
		 Predicate<String> p1 = Str -> Str.length()>5;
		 System.out.println(p1.test("vishal"));
		 
		 //Check if arraylist is empty or not
		 Predicate<Collection> p2 = c -> c.isEmpty();
		 Predicate<ArrayList<String>> p3 = list -> list.isEmpty();
		 
		 //Program to display names starting with K.
		 
		 Predicate<String> pNameStartWithK =  str ->str.startsWith("k");
		 
		 String[] names = {"abc","kaf","bnbs"};
		 for (String name: names) {
			 if(pNameStartWithK.test(name)) 
				 System.out.println(name);
		 }
		 
		 //check if string is valid ie. not null and empty
		 Predicate<String> IspNull = str -> str==null;
		 Predicate<String> IspEmpty = str -> str.length()==0;
		 Predicate<String> IsValid = IspNull.negate().and(IspEmpty.negate()); 
		 System.out.println(IsValid.test(null));
		 
		 
	 }
	
}
