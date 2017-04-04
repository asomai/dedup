package com.dedup;

import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * DeDup class contains 3 different methods to remove duplicate numbers form int[]
 *  
 * @author anil
 *
 */
public class DeDup {

	/**
	 * Method to remove duplicates from int[] without using java collection api.
	 *  
	 * @param randomIntegers
	 * @return int[]
	 */
	public int[] removeDupWithoutUsingCollection(int[] randomIntegers) {
		boolean[] same = new boolean[randomIntegers.length];
		for (int i =0; i<randomIntegers.length; i++) {
			for (int j=i+1; j< randomIntegers.length; j++) {
				if (randomIntegers[i] == randomIntegers[j]) {
					same[j] = true;
				}
			}
		}
		
		List<Integer> result = new ArrayList<Integer>();
		
		for (int i=0;i<randomIntegers.length;i++) {
			if (!same[i]) {
				result.add(randomIntegers[i]);
			}
		}

		return Ints.toArray(result);
	}

	/**
	 * Method to remove duplicates from int[] using 
	 * java collection List api.
	 * 
	 * @param randomIntegers
	 * @return int[]
	 */
	public  int[] removeDupUsingList(int[] randomIntegers) {
		System.out.println("");
		
		List<Integer> list = new ArrayList<Integer>();
	    for(int i = 0; i<randomIntegers.length; i++) {
	        if (!list.contains(randomIntegers[i])) {
	            list.add(randomIntegers[i]);
	        }
	    }

	    return Ints.toArray(list);
	}

	/**
	 * Method to remove duplicates from int[] using 
	 * Java collection Set api.
	 * 
	 * @param randomIntegers
	 * @return int[]
	 */
	public int[] removeDupUsingSet(int[] randomIntegers) {
		Set<Integer> result = new LinkedHashSet<>();
		
		for (int i =0; i<randomIntegers.length; i++) {
			result.add(randomIntegers[i]);
		}
		
		return Ints.toArray(result);
	}

		
	
}
