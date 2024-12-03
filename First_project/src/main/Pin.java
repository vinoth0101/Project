package main;
public class Pin{
	  public int pin1() {
		 Input obj1 =new Input();
		 int pin=0;
		 int orgpin=5555;

		   while(true){
	   System.out.println("enter the pin");
	   pin = obj1.receiving();	
	   
	   if(orgpin == pin) { break;}
	        
	   System.out.println("Entered worng pin");

		}
		   return pin;
		  
		 
	}
	}