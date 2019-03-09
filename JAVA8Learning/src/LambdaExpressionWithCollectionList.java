import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Sorting of array list using comparator and lambda expression.
public class LambdaExpressionWithCollectionList {
	public static void main(String[] args) {
	ArrayList<Integer> intgr = new ArrayList<Integer>();
	//by default insertion order 
	intgr.add(10);
	intgr.add(30);
	intgr.add(20);
	intgr.add(20);
	System.out.println("Initial list.."+ intgr);
	
	// Sort it using Collections.sort in default order.
	 Collections.sort(intgr);
	 System.out.println("Default sorted list.."+ intgr);
	 
	 //Reverse order of sorting.(desencding order).Hence we need to use the comparator concept.
	 Collections.sort(intgr, new myComparator());
	 System.out.println(" sorted list using comparator.."+ intgr);
	 
	 //Sorting of collections using Lambda expression.NO need to create comparator object.
	 Comparator<Integer> comparatorObj =   (a,b) ->{ return (a>b) ? -1 : (a>b) ? +1 : 0 ; };
	 Collections.sort(intgr, comparatorObj);
	 
	}
}

 class myComparator implements Comparator<Integer> {

//	@Override
//	public int compare(Integer obj1, Integer obj2) {
//		if (obj1 > obj2)
//			return -1;
//		if (obj1 < obj2)
//			return 1;		 
//		return 0;//dont insert that element
//	}
//	
	 //The above can be written using the ternary operator like below.
	 @Override
		public int compare(Integer obj1, Integer obj2) {
		return (obj1>obj2) ? -1 : (obj1<obj2) ? +1 : 0 ;
		}
		
}
