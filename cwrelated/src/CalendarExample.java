import sun.util.resources.CalendarData_ro;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        System.out.println(cl.get(Calendar.HOUR));
        cl.set(2013, 2, 13);
        System.out.println(cl.get(Calendar.MONTH));
        System.out.println(cl.getFirstDayOfWeek());
    }
}
