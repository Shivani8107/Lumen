package com.recharge;
import java.util.ArrayList;
import java.util.function.Function;

import com.consumer.CallQualityFeedback;

public class RechargeConsumerData {
	
	ArrayList<Recharge> itemList = new ArrayList<>();
	
	RechargeConsumerData(){
		itemList.add(new Recharge(1,50,"10/10/23"));
		
	}
	
		public void rechargeData(Function<Recharge,Integer> o) {
	        for(Recharge i : itemList) {
	        	System.out.println(function.apply(i));
	        }
	    }
		
		public static void main(String[] args) {
			RechargeConsumerData obj = new RechargeConsumerData();
			obj.rechargeData((item)-> item.getCustomerId());
		}
	

}
