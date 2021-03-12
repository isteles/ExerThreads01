package view;

import controller.Thread1;
import controller.Thread2;
import controller.Thread3;
import controller.Thread4;
import controller.Thread5;

public class Principal {

	public static void main(String[] args) {

		Thread1 a = new Thread1();
		a.start();
		
		Thread2 b = new Thread2();
		b.start();
		
		Thread3 c = new Thread3();
		c.start();
		
		Thread4 d = new Thread4();
		d.start();
		
		Thread5 e = new Thread5();
		e.start();
		}
}