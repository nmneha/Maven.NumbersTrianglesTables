package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 0; i < numberOfRows; i++) {
            triangle = triangle + "*\n";
        }
        return triangle;
    }

    public static String getRow(int width) {
        String stars = "";
        for (int i = 0; i < width; i++) {
            stars = stars + "*";
        }
        return stars;
    }

    public static String getSmallTriangle() {

        return null;
    }

    public static String getLargeTriangle() {

        return null;
    }
}
