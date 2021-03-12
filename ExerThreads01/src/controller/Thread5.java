package controller;

public class Thread5 extends Thread {
	
	
	@Override
	public void run() {
		System.out.println("Thread 5: " + getId());
	}
}
