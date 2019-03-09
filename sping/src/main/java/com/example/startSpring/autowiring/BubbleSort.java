package com.example.startSpring.autowiring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgo{

	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		return array;
	}

}
