package com.exercise;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.consumer.CallQualityFeedback;

public class CustomerCollection {
	
	ArrayList<Customer> customerList = new ArrayList<>();
	CustomerCollection()
	{
		 customerList.add(new Customer("Shivani", "Basic", "A", 150));
	     customerList.add(new Customer("omkar", "Premium", "B", 250));
	     customerList.add(new Customer("xyz", "Standard", "C", 180));
	     customerList.add(new Customer("abc", "Basic", "D", 100));
	     customerList.add(new Customer("efg", "Premium", "E", 300));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerCollection obj = new CustomerCollection();
		  obj.customerList.sort(Comparator.comparingDouble(customer -> customer.planAmount));

	        obj.customerList.forEach(customer -> System.out.println("Name: " + customer.customerName +
	                ", Plan: " + customer.planType +
	                ", Location: " + customer.location +
	                ", Plan Amount: " + customer.planAmount));
	        
	        obj.customerList.removeIf(customer -> customer.planAmount < 200);
	        
	        System.out.println("Removed amounts less than 200 ");
	        obj.customerList.forEach(customer -> System.out.println("Name: " + customer.customerName +
	                ", Plan: " + customer.planType +
	                ", Location: " + customer.location +
	                ", Plan Amount: " + customer.planAmount));


	}

}
