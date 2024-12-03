package main;

import java.util.Scanner;

public class Withdraw {
	 void amount () {
		 Feedback obj = new Feedback();
		 Input obj1 =new Input();
		 Pin obj2 = new Pin();
		 Scanner scn = new Scanner(System.in);
         int amount=0;
		 
	    
		  System.out.println("Enter a amount");
		  
		   while(true) {
			   
			 amount= obj1.receiving();
			 if(amount<=20000) {
				
				 obj2.pin1();
				   System.out.println("Take the amount");
				   obj.feedb();
				 break;
				 
			 }System.out.println("Enter amount less then '20000'");
		
		 }
		   }
}
	 