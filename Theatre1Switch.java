package lab3;

/*Theatre1Switch.java -- the instantiable class, uses the switch selection statement to determine the price of a 
theatre ticket based on a given day
*/

public class Theatre1Switch {
	
	private String day;
	private int price1 = 20;
	private int price2 = 30;
	
	public void setDay (String day) {
		this.day = day;
	}
	
	public int getPrice1() {
		return price1;
	}
	public int getPrice2() {
		return price2;
	}
	
	public void showPrice(String day) {
	
	switch(day.toLowerCase()) {
	case "monday":
	case "tuesday":
	case "wednesday":
	case "thursday":
	System.out.println("Ticket price is: " + price1 + " EUR");
	break;
	
	case "friday":
	case "saturday":
	case "sunday":
	System.out.println("Ticket price is: " + price2 + " EUR");
	break;
	
	default:
		System.out.println("Please chech your input");
	
	}
	}

}
