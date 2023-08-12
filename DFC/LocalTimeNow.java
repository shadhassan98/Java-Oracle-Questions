package DFC;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeNow {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        long timeToBreakfast = 0;
        LocalTime office_start = LocalTime.of(20,30);
        if(office_start.isAfter(now)) {
            timeToBreakfast = now.until(office_start,ChronoUnit.MINUTES);
        }
        else {
            timeToBreakfast = now.until(office_start,ChronoUnit.HOURS);
        }
        System.out.println(timeToBreakfast);
    }
}
