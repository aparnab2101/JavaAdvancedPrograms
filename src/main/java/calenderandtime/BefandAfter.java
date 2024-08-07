package calenderandtime;

import java.util.Calendar;

public class BefandAfter {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(2020,2,11,23,11,34);
        Calendar c1=Calendar.getInstance();
        System.out.println(c.before(c1));
        System.out.println(c.after(c1));
    }
}
