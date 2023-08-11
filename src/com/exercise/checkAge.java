package com.exercise;
import java.util.function.Predicate;



class Candidate {
    public void checkAge(int age) {
        if (age > 18) {
            System.out.println("valid age");
        } else {
            System.out.println("invalid age");
        }
    }
}



public class checkAge {
	
	int[] agearray = {12, 23, 11, 19, 35, 22};
	
	public void age(Predicate<Integer> c) {
	    	for(int i = 0; i<agearray.length; i++) {
	    		if(c.test(agearray[i])){
	    			System.out.println("Valid");
	    		}else {
	    			System.out.println("Valid");
	    		}
	        }
	    	
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAge obj = new checkAge();
//		obj.age((c)-> c.checkAge(c));
		obj.age(age -> {
            Candidate candidate = new Candidate();
            candidate.checkAge(age);
            return age > 18;
        });

	}

}
