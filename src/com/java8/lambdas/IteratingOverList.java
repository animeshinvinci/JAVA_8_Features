package com.java8.lambdas;

import java.util.Arrays;
import java.util.List;


public class IteratingOverList {
	
	public void ArraysSortOld(){

		
	}
	
	public void ArraysSortUsingLambdas(){
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach(n -> System.out.println(n));
	}
	

}
