package TimeException;

import java.util.Date;

public class TimeException {
    long time;

    public TimeException(long time) {
        this.time = time;
        Date date = new Date();
        date.setTime(time);
    }

}
