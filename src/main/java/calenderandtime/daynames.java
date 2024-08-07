package calenderandtime;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class daynames {
    public static void main(String[] args) {
        DateFormatSymbols d=new DateFormatSymbols(new Locale("ary"));
        String[] names=d.getMonths();
        for (String days:names
             ) {
            System.out.println(days);
        }
    }
}
