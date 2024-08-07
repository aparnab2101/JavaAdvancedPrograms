package calenderandtime;

import java.util.Calendar;

public class Cal {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(2022,3,21);
        c.set(2024,5,21,12,23);
        c.add(Calendar.MONTH,4);
        c.add(Calendar.DATE,5);
        c.add(Calendar.MONTH,-2);
        System.out.println(c.getTime());
    }
}
