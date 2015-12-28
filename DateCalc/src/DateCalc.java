import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/*
 * Allows you to add and subtract days from the current date and figure out how many months and days there are left until your birthday
 * @author Sukhjinder Nahal
 * @modifier Hybridization
 */

public class DateCalc {

		public static void main(String[] args) {

			LocalDate today = LocalDate.now();
			System.out.println("Todays date is " + today.format(DateTimeFormatter.ofPattern("MM/d/uuuu")));
			System.out.println("Day of week: " + today.getDayOfWeek() );
			int days;
			int bm;
			int bd;

			System.out.println("Enter (a) to add days, (s) to subtract days, (b) to get the number of months and days unitl your birthday, (e) to exit ");
			LocalDate bday = LocalDate.of(1000, 11, 23);
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

				if(input.equalsIgnoreCase("b"))
				{
					System.out.println("Enter the month number of your birthday (Ex. April is 4)");
					bm = keyboard.nextInt();
					System.out.println("Enter the day number of your birthday");
					bd = keyboard.nextInt();
					bday = bday.of(today.getYear(), bm, bd);
					if(bday.isBefore(today))
					{
						bday = bday.of(today.getYear()+1, bm, bd);
					}
					if (Period.between(today, bday).getMonths()==0 && Period.between(today, bday).getDays()==0){
						System.out.println("Today is your birthday! Happy birthday!");
					}

					else{
						System.out.println("There are "+ Period.between(today, bday).getMonths()+ " months and "+Period.between(today, bday).getDays()+ " days left until your birthday.");
					}

				}


				System.out.println("Enter (a) to add days, (s) to subtract days, (b) to get the number of months and days unitl your birthday, (e) to exit ");
				input = keyboard.next();

			}

			System.out.println("Bye");
			keyboard.close();

		}

}
