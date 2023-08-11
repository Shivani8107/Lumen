package com.exercise;
import java.util.function.Consumer;

import com.consumer.CallQualityFeedback;

import java.util.ArrayList;



public class Iterate {
	
	
	ArrayList<Person> itemList = new ArrayList<>();
	
	Iterate(){
		itemList.add(new Person("Shivani","shivani@gmail.com"));
		itemList.add(new Person("Omkar","omkar@gmail.com"));
	}
	
	public void addPerson(Consumer<Person> o) {
        for(Person i : itemList) {
        	o.accept(i);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate obj = new Iterate();
		obj.addPerson((o)-> System.out.println(o));

	}

}
