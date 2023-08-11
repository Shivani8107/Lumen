package com.threads;


class PrintNames implements Runnable {

    private String[] names = {"Peter", "Sam", "Edgar", "Mathew", "Simond"};

    public void printArray() {
        synchronized (this) {
            for (String s : names) {
                System.out.println(s);
            }
        }
    }

    public void run() {
        printArray();
    }
}
public class syncronize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNames printNames = new PrintNames();
        
        Thread thread1 = new Thread(printNames);
        Thread thread2 = new Thread(printNames);
        
        thread1.start();
        thread2.start();
        

	}

}
