package com.maxtrain.sarah;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!\n============");
		
		int i = 0;
		var h =1;
		
		boolean b = true;
		
		String s = "Greg";
		
		int[] ints = new int[] {1, 2, 3, 4, 5};
		
		//Equivalent to List<int>
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		
		//Equivalent to Dictionary<int,string>
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "First String");
		
		//foreach()
		var sum = 0;
		for(var idx : ints) {
			sum += idx;
		}
		System.out.println("Sum is " + sum);
		
		//for(;;)
		var sum1 = 0;
		for(var idx = 0; idx <= 10; idx++) {
		}
		System.out.println("The  sum of numbers 1 to 10 is " + sum);
		
	}

}
