package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String evens = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
                evens = evens + i;
            }
        }

            return evens;
    }


    public static String getOddNumbers(int start, int stop) {
        String odds = "";
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0)
                odds = odds + i;
        }
        return odds;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return NumberUtilities.getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int stop) {
        return NumberUtilities.getRange(0, stop, 1);
    }
//        String result = "";
//        for (int i = 0; i < stop; i++) {
//            result += i;
//        }
//        return result;


    public static String getRange(int start, int stop) {
        return NumberUtilities.getRange(start, stop, 1);
    }
//        String result = "";
//        for (int i = start; i < stop; i++) {
//            result += i;
//            // += is a string concat equals: means result = result + i
//        }



    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i=i+step) {
            result += i;
            // += is a string concat equals: means result = result + i
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String s = "";
        for (int i = start; i < stop; i=i+step) {
            s = s + Math.round(Math.pow(i, exponent));
        }

        return s;
    }
}
