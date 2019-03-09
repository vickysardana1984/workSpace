import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Program to find out even numbers and save them in a new list.(uses filter)
//To it with and without streams.
public class StreamsExampleFilterOnCollection {

	public static void main (String args[]) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l1.add(25);
		l1.add(30);
		
		//Find out all the even numbers and add into the new list.
		List<Integer> listOfEvenNumbersWithoutStreams = new ArrayList<Integer>();
		for(int i : l1) {
			if(i%2==0)
				listOfEvenNumbersWithoutStreams.add(i);
		}
		System.out.println(listOfEvenNumbersWithoutStreams);
		
		//Using streams and filter elements and then save them in a collection using collect.
		List<Integer> listOfEvenNumbersWithStreams = new ArrayList<Integer>();
		//get Streams and then use filter method based on some boolean conditions.
		listOfEvenNumbersWithStreams = l1.stream().filter(I -> I%2 ==0).collect(Collectors.toList());
		System.out.println("With Streams ... "+listOfEvenNumbersWithStreams);
		
		//Create a collection of list with double the value of 
	}
	
}
