package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
		
	public int receiving() {
			int inp1 = 0;
			Scanner sc1 = new Scanner(System.in);
				
			try {inp1 =sc1.nextInt();
				}
		    catch (InputMismatchException e){ 
		    	
		    	System.out.println("inpute mismatch\n");
		    
		    	}
			return inp1;
	}

	
 }
