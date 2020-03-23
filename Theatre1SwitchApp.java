package lab3;
import java.util.*;
public class Theatre1SwitchApp {

	public static void main(String[] args) {
		String newDay;
		
		Theatre1If t = new Theatre1If();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the day of the week to find out the ticket price: ");
		newDay = input.next();
		
		t.setDay(newDay);
		t.showPrice();
		
		int tPrice1 = t.getPrice1();
		int tPrice2 = t.getPrice2();
		

	}

}
