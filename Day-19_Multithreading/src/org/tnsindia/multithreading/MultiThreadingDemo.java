package org.tnsindia.multithreading;

//Demo on MultiThread

public class MultiThreadingDemo implements Runnable {

	public static void main(String[] args) {
		Thread t1=new Thread("Thread1");
		Thread t2=new Thread("Thread2");
		t1.start();
		t2.start();
		
		System.out.println(t2.getName());
		System.out.println(t1.getPriority());
		
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

}
