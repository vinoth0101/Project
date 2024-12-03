package main;

import java.util.Scanner;

public class Deposite {
	void money() {
		Feedback obj = new Feedback();
		Pin obj2 = new Pin();
		
		String input;
		int pass;
		
		Scanner s1 = new Scanner(System.in);
		
		while(true) {
		System.out.println("Insert the amount and type 'ok' ");
		input = s1.nextLine();
		
		if (input.equals("ok")) {
			break;
		}
		
		System.out.println("Please insert the amount and click 'ok' ");
		}
		
		obj2.pin1();
		System.out.println("Amount has deposited to you'r account\n");
		System.out.println("Receipt will sended to you linked movblie number\n");
		obj.feedb();
	}

}
