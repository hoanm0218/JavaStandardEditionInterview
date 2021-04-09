package com.hoanm.format;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatExample {

    public static void main(String[] args) {

        String pattern1 = "dd/MM/yyyy";
        String pattern2 = "dd/MM/yyyy hh:mm:ss a";
        String pattern3 = "EEEEE, MMMMM, yyyy hh:mm:ss a";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern3);
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern3,new Locale("vi", "VN"));
        System.out.println(sdf.format(new Date()));
        System.out.println(sdf1.format(new Date()));
    }
}
