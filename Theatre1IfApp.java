package lab3;
import java.util.*;
/** 
More Problems on Selection Statements
Problem 1: 
Your local theatre charges different prices during the week and during the weekends.  The prices are outlined in the table below:
Day:				Price:
Monday - Thursday		€20
Friday - Sunday			€30
You have been asked to develop an application that allows a user to enter the day of the week and then display the cost of a theatre ticket for that person based on the day of the week. 
Use instantiable classes in your application.  Save the instantiable class as Theatre1.java
Theatre1IfApp.java 
	-- prompts the user to input a day
	-- uses the instantiable class Theatre1If to determine the actual cost of a theatre ticket based on the given day
*/

public class Theatre1IfApp {

	/* version#1
	public static void main(String[] args) {
		int newDay;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the day of the week from 1 - 7 to find out the ticket price: ");
		newDay = input.nextInt();
		
		Theatre1If price = new Theatre1If(newDay);
		
		
	}//end class
	*/
	
	
	public static void main(String[]args) {
		
		// declare a variable to store the day entered by the user
		String newDay;
		
		// declare a variable named t and create an object of type Theatre1If
		Theatre1If t = new Theatre1If();
		
		// create an object of type Scanner to allow input from the keyboard
		Scanner input = new Scanner(System.in);
		
		// input
        // prompt the user to input a day
		// reads a single word from the keyboard
		System.out.println("Please enter the day of the week to find out the ticket price: ");
		newDay = input.next();
		
        // use (i.e. by calling/invoking) the setter method setDay()
		// to store in the instance variable named day of the object t the day provided by the user
		t.setDay(newDay);
		
        // processing: calculate the price of a tiket in the given day
		t.showPrice();
		
        // output
        // invoke/call the getter method getPrice() to retrieve the cost of the ticket
		int tPrice1 = t.getPrice1();
		int tPrice2 = t.getPrice2();
		
        // it is not mandatory, but we can display a user friendly message in case that the day is not valid,
        // and therefore there is a negative value in the p variable
        // (recall that the calculatePrice() method of the Theatre1If class assigns/stores in the price instance variable if the day is invalid)	
	}

}//end main
