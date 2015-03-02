import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/*
 * Allows you to add and subtract days from the current date
 * @author Sukhjinder Nahal
 */

public class DateCalc {
	
		public static void main(String[] args) {
			
			LocalDate today = LocalDate.now();
			System.out.println("Todays date is " + today.format(DateTimeFormatter.ofPattern("MM/d/uuuu")));
			System.out.println("Day of week: " + today.getDayOfWeek() );
			int days;
			
			System.out.println("Enter (a) to add days, (s) to subtract days, (e) to exit ");
			Scanner keyboard = new Scanner(System.in);
			String input = keyboard.next();
			
			while(!input.equalsIgnoreCase("e"))
			{
				
				if(input.equalsIgnoreCase("A"))
				{
					System.out.println("How many days do you want to add");
					days = keyboard.nextInt();
					if(days>0)
					{
						today=today.plusDays(days);
						System.out.println(today.format(DateTimeFormatter.ofPattern("MM/d/uuuu")));
						System.out.println("Day of week: " + today.getDayOfWeek() );
					}
					else
						System.out.println("Error: number of days cannot be negative");
					
				}
		
				if(input.equalsIgnoreCase("s"))
				{
					System.out.println("How many days do you want to subtract");
					days = keyboard.nextInt();
					if(days>0)
					{
						today=today.minusDays(days);
						System.out.println(today.format(DateTimeFormatter.ofPattern("MM/d/uuuu")));
						System.out.println("Day of week: " + today.getDayOfWeek() );
					}
					else
						System.out.println("Error: number of days cannot be negative");
				}
			
				
				System.out.println("Enter (a) to add days, (s) to subtract days, (e) to exit ");
				input = keyboard.next();

			}
			
			System.out.println("Bye");
			keyboard.close();
			
		}
			
		
		
	
		
}
