import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Program to doubnel the integers in a given list and save them in a new list.(uses map)
//To it with and without streams.
public class StreamsExampleOperationOnCollection {

	@SuppressWarnings("unchecked")
	public static void main (String args[]) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(40);
		l1.add(15);
		l1.add(20);
		l1.add(25);
		l1.add(30);
		
		//Find out all the even numbers and add into the new list.
		List<Integer> doubledList = new ArrayList<Integer>();
		for(int i : l1) 
			doubledList.add( i*2);
			
		System.out.println(doubledList);
		
		//Using streams and filter elements and then save them in a collection using collect.
		List<Integer> doubledListWithStreams = new ArrayList<Integer>();
		//get Streams and then use filter method based on some boolean conditions.
		doubledListWithStreams = l1.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println("With Streams ... "+doubledListWithStreams);
		
		
		//Sorting 
		List<Integer> doubledListWithStreamsWithSorting = l1.stream().map(i -> i*2).sorted().collect(Collectors.toList());
		
		System.out.println("sorted ..."+doubledListWithStreamsWithSorting);
		//Create a collection of list with double the value of
		
		//Sort using a customized order ie reverse order.
		List<Integer> doubledListWithStreamsWithCustomizedSorting = l1.stream().map(i -> i*2).sorted((a,b) ->{ return (a>b) ? -1 : (a>b) ? +1 : 0 ; }).collect(Collectors.toList());
		System.out.println("sorted ..."+doubledListWithStreamsWithCustomizedSorting);
		
		//Min example, always need to use get.
		//There is nothing as default min, so you will always need to provide a comparator to it.
		Integer min = l1.stream().min((a,b) -> {return (a>b) ? -1 : (a<b) ? 1 :0; }).get();
		
		//Stream for each example
		doubledList.stream().forEach(i -> System.out.println(i));
		
		//toArray()
		Integer[] array = l1.stream().toArray(Integer[] :: new);
		for (int a : array)
			System.out.println(a);
		
		//Stream without collections.
		Stream s = Stream.of(9,99,99);
		s.forEach(a -> System.out.println(a));
		
		//Stream on an array.
		Double[] array1 = {10.0,10.1,10.2,10.3};
		Stream s1 = Stream.of(array1);
		
		s1.forEach(a -> System.out.println(a));
	}
	
}
