package com.exercise;
import java.util.function.Predicate;

import com.consumer.CallQualityFeedback;
import com.consumer.consumer;

public class EvenNumbers {

	 int[] arr={12,23,11,19,25,32,16,22};
	 
	 public void calculateEven(Predicate<Integer> c) {
	    	for(int i = 0; i<arr.length; i++) {
	    		if(c.test(arr[i])){
	    			System.out.println(arr[i]);
	    		}
	        }
	    	
	    }
	 public static void main(String[] args) {
	        EvenNumbers obj = new EvenNumbers();
	        obj.calculateEven((c)-> c%2==0);

	       

	    }

}
