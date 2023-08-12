package JDBCLocale;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;



public class LocaleExample {

    public static void main(String[] args) {
        
        Locale usLocale = Locale.US;
        Locale frenchLocale = Locale.FRANCE;
        double d = 15;
        Locale l = new Locale("en", "US");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(l);
        System.out.println(formatter.format(d));

        Date currentDate = new Date();

        DateFormat usDateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, usLocale);
        DateFormat frenchDateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, frenchLocale);

        System.out.println("US Date Format: " + usDateFormat.format(currentDate));
        System.out.println("French Date Format: " + frenchDateFormat.format(currentDate));
    }
}

