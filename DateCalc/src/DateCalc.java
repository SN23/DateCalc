import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class DateCalc {
	
		public static void main(String[] args) {
			
			LocalDate today = LocalDate.now();
			System.out.println("Todays date is " + today.format(DateTimeFormatter.ofPattern("MM/d/uuuu")));
			int days;
			
			System.out.println("Enter (a) to add days, (b) to subtract days, (e) to exit ");
			Scanner keyboard = new Scanner(System.in);
			String input = keyboard.next();
			
			
			
			
			
			
			
			
			
			
			
		}
}
