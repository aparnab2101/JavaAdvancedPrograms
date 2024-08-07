package calenderandtime;

import java.util.Calendar;

public class Calendar1 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getTime());
        c.add(Calendar.MONTH,3);
        System.out.println(c.getTime());
        c.add(Calendar.DATE,4);
        System.out.println(c.getTime());
        c.add(Calendar.DAY_OF_MONTH,3);
        System.out.println(c.getTime());
        c.add(Calendar.HOUR,2);
        System.out.println(c.getTime());
        c.add(Calendar.MINUTE,3);
        System.out.println(c.getTime());
        c.add(Calendar.DAY_OF_WEEK,-3);
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.getMaximum(Calendar.DAY_OF_WEEK));
        System.out.println(c.getMaximum(Calendar.MONTH));
        System.out.println(c.getMaximum(Calendar.YEAR));
        System.out.println(c.getMaximum(Calendar.DATE));
        System.out.println(c.getMinimum(Calendar.DAY_OF_WEEK));
        System.out.println(c.getMinimum(Calendar.MONTH));
        System.out.println(c.getMinimum(Calendar.YEAR));
        System.out.println(c.getMinimum(Calendar.DATE));
    }
}
