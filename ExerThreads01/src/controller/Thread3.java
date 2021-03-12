package controller;

public class Thread3 extends Thread {
	
	
	@Override
	public void run() {
		System.out.println("Thread 3: " + getId());
	}

}
