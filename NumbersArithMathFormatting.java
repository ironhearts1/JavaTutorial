package com.javatutorial;


import java.text.NumberFormat;

public class NumbersArithMathFormatting {
    public static void main(String[] args) {
        //constants
        final float PI = 3.14F;
        // arithmetic
        int wholeByWhole = 10/3;
        double decByDec = (double)10 / (double)3;
//        System.out.println(wholeByWhole);
//        System.out.println(decByDec);
////        int x = 1;
//        x++;
//        // INTERESTING NOTE: if x=1 and y= x++ then x=2 and y=1 ... if x=1 and y= ++x then x=2 and y=2
//        System.out.println(x);
        // order of operation apply duh

        //casting or automatic conversion of types
        // types converted upwards in size if possible
        short x = 1;
        int y = x + 2;
        // this above code works cuz it goes from small to big
//        double h = 1.1;
//        int z = h + 2;
        // this above code doesn't work cuz it goes from big to small so you gotta change the secondary variable to the bigger type
        double h = 1.1;
        double z = h + 2; // java changes 2 to 2.0 for the computation with the implicit casting
        // can be explicitly typed like this tho
        double f = 1.1;
        int g = (int)x + 2;
        // all of this only works with compatible types aka different types of numbers but can't cast Stings to int or others
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(g);
        // can be done between types explicitly like in JS
        String t = "1";
        int u = Integer.parseInt(t) + 2;
//        System.out.println(u);

        // Math class
//        int roundResult = Math.round(1.1F);
//        System.out.println(roundResult);
//        int ceilResult = (int)Math.ceil(1.1F);
//        System.out.println(ceilResult);
//        int maxResult = Math.max(1, 2);
//        System.out.println(maxResult);
//        double randomResult = Math.random() * 100;
//        System.out.println(randomResult);
//        int roundedRandomResult = (int) Math.round(Math.random() *100);
//        System.out.println(roundedRandomResult);

        //formatting numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyResult = currency.format(1234567.891);
        System.out.println(currencyResult);
        String percentResults = NumberFormat.getPercentInstance().format(.01);
        System.out.println(percentResults);


    }
}