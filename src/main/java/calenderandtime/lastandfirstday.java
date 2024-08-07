package calenderandtime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;

public class lastandfirstday {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
       DateFormat d=new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(d.format(c.getTime()));
        for (int i=0;i<6;i++){
           c.add(Calendar.DATE,1);
        }
        System.out.println(d.format(c.getTime()));

    }
}
