package Main;

import java.util.Date;
import java.util.concurrent.Delayed;

public class DateTime {

    public static void main(String[] args) {
        Date backdate = null;

        while (true) {

            Date date = new Date();
            if (date == backdate) {
                backdate = date;

                continue;
            }

            System.out.println(date);
        }
    }

}
