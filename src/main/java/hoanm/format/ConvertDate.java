package hoanm.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ConvertDate {

    public static void main(String[] args) throws ParseException {

        //Convert from String to Date
        String dateStr = "01/01/2021";
        String pattern = "dd/MM/yyyy";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern,new Locale("vi", "VN"));
        Date date = simpleDateFormat.parse(dateStr);
        System.out.println(date);
    }
}
