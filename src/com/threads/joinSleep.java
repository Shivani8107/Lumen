package com.threads;
import java.util.Scanner;


class Detail extends Thread {
	boolean count = true;
	public void acceptDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter email");
		String email = sc.nextLine();
		
		System.out.println(name);
		System.out.println(email);
	}
	
	public void run() {
		acceptDetails();
	}
}

class count extends Thread {
	public void run() {
		
		
		
	}
}

public class joinSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detail t1 = new Detail();
		t1.start();
		try {
			t1.join(5000);
			System.out.println("Hello");
			
		}catch (InterruptedException e) {
            e.printStackTrace();
        }
		

	}

}
