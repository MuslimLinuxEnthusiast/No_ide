//work in progress. not functional yet.

import java.util.*;

public class DayOfWeek(int day) {
    
    String[] Weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    
    for (int i = 0; i < weekdays[]; i++) {
        System.out.println(weekdays[i] );
    }
    
    	/*	//days of week naming
		switch(dayOfWeek) {
		    case 1: System.out.println("Sunday");
		    break;
		    
		    case 2: System.out.println("Monday");
		    break;
		    
		    case 3: System.out.println("Tuesday");
		    break;
		    
		    case 4: System.out.println("Wednesday");
		    break;
		    
		    case 5: System.out.println("Thursday");
		    break;
		    
		    case 6: System.out.println("Friday");
		    break;
		    
		    case 7: System.out.println("Saturday");
		    break;
		    
		}   */
		
    
}
public class Main
{
	public static void main(String[] args) {
	    
	    //get current time and date
		Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int month = now.get(Calendar.MONTH);
		int dayOfMonth = now.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		int year = now.get(Calendar.YEAR);
		
		//display greeting
		if (hour < 12) {
		    System.out.println("Good morning!");
		} else if (hour < 18) {
		    System.out.println("Good afternoon!");
		} else { 
		    System.out.println("Good evening!");
		}
		
		//display minutes
		System.out.print("it's ");
		if (minute!= 0) {
		    System.out.print(minute);
		    System.out.print( (minute != 1) ? " minutes past " : " minute past ");
		}
		
		//display hours
		System.out.println(hour + " O'Clock");
		
		//display day
		System.out.println(" on " + dayOfWeek);
		
		
		
		
	}
	
}
