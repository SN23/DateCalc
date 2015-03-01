import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class DateCalc {
	
		public static void main(String[] args) {
			
			LocalDate today = LocalDate.now();
			System.out.println("Todays date is " + today.format(DateTimeFormatter.ofPattern("MM/d/uuuu")));
			int days;
			
			System.out.println("Enter (a) to add days, (s) to subtract days, (e) to exit ");
			Scanner keyboard = new Scanner(System.in);
			String input = keyboard.next();
			
			
			if(input.equalsIgnoreCase("A"))
			{
				System.out.println("How many days do you want to add");
				days = keyboard.nextInt();
				if(days>0 & days<=31)
				{
					String newDate = today.plusDays(days).format(DateTimeFormatter.ofPattern("MM/d/uuuu"));
					System.out.println(newDate);
				}
			}
		
			if(input.equalsIgnoreCase("s"))
			{
				System.out.println("How many days do you want to subtract");
				days = keyboard.nextInt();
				if(days>0 & days<=31)
				{
					String newDate = today.minusDays(days).format(DateTimeFormatter.ofPattern("MM/d/uuuu"));
					System.out.println(newDate);
				}
			}
			
			if(input.equalsIgnoreCase("e"))
			{
				System.out.println("Bye");
			}
			
			
			
			
			
			
			
			
		}
}
