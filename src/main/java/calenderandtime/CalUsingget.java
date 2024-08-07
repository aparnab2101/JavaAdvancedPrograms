package calenderandtime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class CalUsingget {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.getActualMaximum(Calendar.HOUR_OF_DAY));
        System.out.println(c.getActualMinimum(Calendar.MONTH));

        ZoneId newYorkZoneId = ZoneId.of("Asia/Kolkata");

        // Get the current date and time in New York
        ZonedDateTime newYorkTime = ZonedDateTime.now(newYorkZoneId);

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = newYorkTime.format(formatter);

        // Print the current time in New York
        System.out.println("Current time in India: " + formattedDateTime);
        System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(c.getActualMaximum(Calendar.DATE));
        System.out.println(c.getActualMaximum(Calendar.DAY_OF_WEEK));
        System.out.println(c.getActualMinimum(Calendar.DAY_OF_WEEK));

    }
}
