package com.example.startSpring.autowiring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//Primary : If you have two class implementation of an interface in the same location, the Spring loader needs to know which 
//needs to be called. Hence Spring will not be able to load it.
@Qualifier("quick")
public class QuickSort implements SortAlgo {

	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		return array;
	}

}
