// Working with dates and times
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.LocalDateTime; // Correct import for LocalDateTime
import java.time.format.DateTimeFormatter; // Import for formatting LocalDate

public class Main {
    public static void main(String[] args) {

        // Create a Date object representing the current date and time.
        Date d = new Date();
        System.out.println(d);

        // Create a GregorianCalendar object with the date February 28, 2009.
        GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
        // Note: Months are 0-based, so 1 represents February.

        // Add one day to the GregorianCalendar object.
        gc.add(GregorianCalendar.DATE, 1); 
        // This increments the day part of the date.

        // Get a Date object from the modified GregorianCalendar.
        Date d2 = gc.getTime();
        System.out.println(d2);

        // Create a DateFormat object for displaying dates in a human-readable format.
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);

        // Print the modified date in a full date format.
        System.out.println(df.format(d2));

        LocalDateTime ldt = LocalDateTime.now(); // Corrected capitalization
        System.out.println(ldt);

        LocalDate ld = LocalDate.of(2009, 1, 28); // Corrected capitalization
        System.out.println(ld);
    
    }
}
 