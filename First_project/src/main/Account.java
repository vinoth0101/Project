package main;

import java.util.Scanner;

public class Account {
	Input obj =new Input();
	Scanner s1 =new Scanner(System.in);
	
	void balance () {
		int orgpin=5555;
		int pin;
	    Feedback obj = new Feedback();
	    Input obj1 =new Input();
	    while(true) {
	    	System.out.println("Enter you pin");
	    	pin=obj1.receiving();	    	
	    	if(orgpin==pin) {
	    		break;
	    	}System.out.println("pin was wrong");	    	    
	    
	    }
		System.out.println("you account balance is '10000'\n");
		obj.feedb();
	}

}
