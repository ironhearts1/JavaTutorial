package com.javatutorial;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

    public class VarsTypesStringsArrays {
        public static void main(String[] args) {
            // variables and types
            // byte stores 1 byte and can hold numbers from -128 - 127
            // int can store much more takes 4 bytes -2b-2b
            // longs take even more at 8 bytes and can store basically any number

            byte myAge = 30;
            int viewsCount = 123_456_789; // use underscores to seperate numbers like commas in normal english
            long bigViewCount = 3_123_456_789L; // even tho long is specified it will throw an error if number is too big without putting an 'l' at the end of the number... capital L prefered
            float price = 10.99F; // same with floats/doubles...will assume its a double unless used with the 'F' | doubles are 15-16 decimal points out floats are 6-7
            char letter = 'A';
            boolean isEligible = true;
//        System.out.println(myAge);
//        System.out.println(bigViewCount);
//        System.out.println(isEligible);

            byte age = 30;
            Date now = new Date();
//        System.out.println(now);

            Point point1 = new Point(1,2) ;
            Point point2 = point1;
            point1.x = 2;
//        System.out.println(point2);

            // Strings
            // strings are immutable... any method that messes with a string returns a new string instead of changing the original
            String message = "Hello World" + "!!";
            String trimmedMessage = " Hello   World  ! ";
            String escapeMessage = "Hello \"Josh\"";
//        System.out.println(message.length());
//        System.out.println(message.indexOf("e"));
//        System.out.println(message.replace("!", "*"));
//        System.out.println(trimmedMessage.trim());
//        System.out.println(escapeMessage);
            // c:\Windows\...
            // '\' backslash is how you use an escape sequence
            // \\ to get an actual backslash \n to get a new line \t to get a tab
            String escapeMessage2 = "c:\tWindows\\...";
//        System.out.println(escapeMessage2);

            // Arrays
            int[] numbers = { 2, 3, 4, 1, 4};
            Arrays.sort(numbers);
            System.out.println(numbers.length);
            System.out.println(Arrays.toString(numbers));
            int[][] numbers2d = new int [2][3]; // or type as = { { 1, 2, 3 }, { 4, 5, 6 } }
            numbers2d[0][0] = 1;
            System.out.println(Arrays.deepToString(numbers2d));




        }
    }
