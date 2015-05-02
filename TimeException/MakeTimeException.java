package TimeException;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MakeTimeException {

    public static void main(String[] args) {
        String format;
        Scanner scanner = new Scanner(System.in);
        TimeException time = new TimeException(37);

        if (time.time > 24 || time.time < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }

    }

}
