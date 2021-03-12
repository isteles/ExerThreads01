package controller;

public class Thread2 extends Thread {
	
	
	@Override
	public void run() {
		System.out.println("Thread 2: " + getId());
	}
}
