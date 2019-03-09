import java.util.TreeSet;

//Sorting of array list using comparator and lambda expression.
//We pass the lambda expression as an argument to Compartors/ runnables etc...Therefore using lambda we pass beahviours/functions as method argument. 
public class LambdaExpressionWithCollectionTreeSet {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Without Lambda
		TreeSet<Integer> intSet1 = new TreeSet<Integer> (new myComparator());
		intSet1.add(10);
		intSet1.add(30);
		intSet1.add(20);
		intSet1.add(40);
		
		
		System.out.println(intSet1);
		
		
		
		//With Lambda
		TreeSet<Integer> intSet = new TreeSet<Integer> ((a,b) ->{ return (a>b) ? -1 : (a<b) ? +1 : 0 ; });
		intSet.add(10);
		intSet.add(30);
		intSet.add(20);
		System.out.println(intSet);
	}
}


