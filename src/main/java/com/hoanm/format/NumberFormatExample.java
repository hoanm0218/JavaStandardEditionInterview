package com.hoanm.format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatExample {

    public static void main(String[] args) {

        long l = 123456789;

        Locale locale = new Locale("vi","VN");
        NumberFormat nf = NumberFormat.getInstance(locale);
        System.out.println(nf.format(l));

        DecimalFormat df = new DecimalFormat("###,###.###");
        System.out.println(df.format(l));

    }
}
