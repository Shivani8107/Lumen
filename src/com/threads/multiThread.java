package com.threads;
import java.util.Scanner;


class userDetails extends Thread {
	public void acceptDetails() {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String email = sc.nextLine();
	}
	
	public void run() {
		acceptDetails();
	}
	
}

class simpleIntrest extends Thread {
	public void calculatedIntrest() {
		System.out.println(12000*3*4/100);
	}
	
	public void run() {
		calculatedIntrest();
	}
	
}

public class multiThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		userDetails t1 = new userDetails();
		simpleIntrest t2 = new simpleIntrest();
		t1.start();
		t2.start();

	}

}
