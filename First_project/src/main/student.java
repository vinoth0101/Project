package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class student {
public static void main(String[] args) {
	String card;
    int input = 0;
	Account obj = new Account();
	Withdraw obj2 = new Withdraw();
	Statement obj3 = new Statement();
	Deposite obj4 = new Deposite();
	Input obj5 =new Input();
	
	Scanner Scanner = new Scanner (System.in);
	
		System.out.println("welcom to ATM");
		
		while(true){
		System.out.println("Insert the card and type 'ok'");
	     card = Scanner.nextLine();
	     if (card.equals("ok")) {
           break;
	     }
		}
		 
   	     System.out.println("Select the service");
   	     System.out.println("1. Account balance");
   	     System.out.println("2. withdrew");
   	     System.out.println("3. Statement");
   	     System.out.println("4. Deposite");
   	    
while(true) {   
         input= obj5.receiving();
         
   	     if(input!=0&&input<5) {
	      
	    switch (input){
	    	case 1:
	    	 obj.balance();
	    		break;
	        case 2:
	         obj2.amount();
	            break;
	    	case 3:
	    	 obj3.receipt();
	    		break;
	    	case 4:
	    	 obj4.money();
	    }break;
   	     }System.out.println("Select a valid option");
}
	  
	  }
}


  