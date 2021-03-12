package controller;

public class Thread4 extends Thread {
	
	
	@Override
	public void run() {
		System.out.println("Thread 4: " + getId());
	}
}
