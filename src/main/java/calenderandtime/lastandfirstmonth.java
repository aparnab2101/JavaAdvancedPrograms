package calenderandtime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class lastandfirstmonth {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(Calendar.MONTH,Calendar.JANUARY);
        DateFormat d=new SimpleDateFormat("MMM/yyyy/dd");
        System.out.println(d.format(c.getTime()));
        for (int i=0;i<11;i++){
            c.add(Calendar.MONTH,1);
        }
        System.out.println(d.format(c.getTime()));

    }
}
