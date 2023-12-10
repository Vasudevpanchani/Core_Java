import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class DateandTime {
    public static void main(String[] args) throws ParseException {

        Date d = new Date();
        System.out.println(d);

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.WEEK_OF_YEAR));
        System.out.println(c.get(Calendar.MONTH)); // not perfect result
        System.out.println(c.get(Calendar.DECEMBER)); // not perfect result
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.AM_PM));

        String str;
        SimpleDateFormat ft;
        // Custom date formate
        ft = new SimpleDateFormat("dd-MM-yyyy");
        str = ft.format(new Date());
        System.out.println(str);

        // Custom time formate
        ft = new SimpleDateFormat("hh:mm:ss");
        str = ft.format(new Date());
        System.out.println(str);

        // Custom Date & time formate
        ft = new SimpleDateFormat("hh:mm:ss dd/MM/yyyy");
        str = ft.format(new Date());
        System.out.println(str);

        // Set custom Date & Time
        Date date;

        str = "23/10/2023";
        ft = new SimpleDateFormat("dd/MM/yyyy");
        date = ft.parse(str);
        System.out.println("User define Date: "+ date);

        str = "01:59:25";
        ft = new SimpleDateFormat("hh:mm:ss");
        date = ft.parse(str);
        System.out.println("User define Time: "+ date);

        // Printing local time of current device
        LocalTime myObj = LocalTime.now();
        System.out.println(myObj);

        // Period Class
        Period p;
        p = Period.of(2024, 10, 23);
        System.out.println(p);

        System.out.println(p.getChronology());
        System.out.println(p.getDays());

        LocalDate today = LocalDate.now();
        LocalDate bday = LocalDate.of(2024, 10, 23);

        p = Period.between(today, bday);
        System.out.println(p);
        System.out.println(p.getYears() + " Years " + p.getMonths() + " Months " + p.getDays() + " Days Remaining in your Birthday");
    }
}