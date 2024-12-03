package main;

import java.util.Scanner;

public class Feedback {
	void feedb() {
        Input obj=new Input();
        int fd;
		Scanner scan =new Scanner(System.in);
			
		System.out.println("Rate our service 1 to 3");
		System.out.println("1. Very bad");
		System.out.println("2. Average");
		System.out.println("3. Excelent");
		System.out.println("4. Skip");
		while(true) {
		fd=obj.receiving();	
		if(fd!=0&&fd<5) {
	
		switch(fd) {
		case 1:
			System.out.println("We'll consider you feed back ");
			break;
		case 2:
			System.out.println("Thank you for givin you'r feed back");
			break;
		case 3:
			System.out.println("Thanks for giving good feed back");
			break;
		case 4:
			System.out.println("Thank you");
			break;
		}break;
		}System.out.println("Pleas select a valid number");
	}
		
	}

}
