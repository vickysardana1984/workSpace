package com.example.startSpring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	//sort array
	//search
	//return
	
	//Autowire by name (name of the vaiurable is same as the name of the class) 
//	@Autowired
//	private SortAlgo bubbleSort;

	//Autowire by primary (use any name of the vairable)
	//@Autowired
//	private SortAlgo sortAlgo;
	
	@Autowired
	@Qualifier("quick")
	private SortAlgo sortAlgo;
	public int binarySearch(int[] array,int numberToSearch) {
		
		//BubbleSort bubblesort = new BubbleSort();
		int[] sortedArray = sortAlgo.sort(array);
		return 3;
	}
	
	

//	public SortAlgo getSortAlgo() {
//		return sortAlgo;
//	}

//	public void setSortAlgo(SortAlgo sortAlgo) {
//		this.sortAlgo = sortAlgo;
//	}

//	public BinarySearchImpl(SortAlgo sortAlgo) {
//		super();
//		this.sortAlgo = sortAlgo;
//	}
	
}
