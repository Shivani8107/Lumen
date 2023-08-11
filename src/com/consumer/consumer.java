package com.consumer;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.function.Predicate;

public class consumer {
	
	ArrayList<CallQualityFeedback> itemList = new ArrayList<>();
	
	consumer(){
		itemList.add(new CallQualityFeedback(1,"Shivani","12345678",5));
		
	}
	

    public void evaluateFeedBack(Consumer<CallQualityFeedback> o) {
        for(CallQualityFeedback i : itemList) {
        	o.accept(i);
        }
    }
    
    public void evaluateeedback(Predicate<CallQualityFeedback> o) {
    	for(CallQualityFeedback i : itemList) {
        	if(o.test(i)) {
        		System.out.println("Call quality is good");
        	}else {
        		System.out.println("Call quality is bad");
        	}
        }
    	
    }
    public static void main(String[] args) {
        consumer feedback = new consumer();
        feedback.evaluateFeedBack((o)-> System.out.println(o));
//        feedback.evaluateFeedBack((o)-> o.getRating()>3);

       

    }

}
