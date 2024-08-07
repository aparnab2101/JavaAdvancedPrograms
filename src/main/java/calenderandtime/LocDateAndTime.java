package calenderandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocDateAndTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);//represents current date
        LocalTime time=LocalTime.now();
        System.out.println(time);
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("E,MMM-dd-yyyy HH:mm:ss");
        String formatteddate=dateTime.format(formatter);
        System.out.println(formatteddate);
    }
}
