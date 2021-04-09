package com.hoanm.format;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class MoneyFormatExample {

    public static void main(String[] args) {

        double d = 123456789.123;

        Locale locale = new Locale("vi","VN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        System.out.println(nf.format(d));

        DecimalFormat df = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setGroupingSeparator('-');
        dfs.setCurrencySymbol("VND");
        df.setDecimalFormatSymbols(dfs);
        System.out.println(df.format(d));



    }
}
