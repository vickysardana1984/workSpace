import java.util.TreeMap;

//Sorting of Tree Map, please note it is based on keys and not values.
public class LambdaExpressionWithCollectionTreeSetMap {
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
		//BY default sorting is in chroniclogical order or ascneding order.
		TreeMap<Integer,String> intMap = new TreeMap<Integer,String> ();
		intMap.put(10,"vishal");
		intMap.put(30,"Umang");
		intMap.put(20,"Anchal");
		
		
		System.out.println(intMap);
		
		
		
		//With Lambda
		TreeMap<Integer,String > intSet = new TreeMap<Integer,String>((a,b) -> {return a>b ? -1 : (a<b) ? 1 : 0 ;});
		intMap.put(10,"vishal");
		intMap.put(30,"Umang");
		intMap.put(20,"Anchal");
//		System.out.println(intSet);
	}
}


