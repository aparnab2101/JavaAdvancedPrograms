package calenderandtime;

import java.util.Calendar;

public class DateObj {
    public static void main(String[] args) {
        int year=2024,month=2,date=21;
        Calendar c=Calendar.getInstance();
        c.set(Calendar.DATE,date);
        c.set(Calendar.MONTH,month);
        c.set(Calendar.YEAR,year);
        System.out.println(c.getTime());
    }
}
