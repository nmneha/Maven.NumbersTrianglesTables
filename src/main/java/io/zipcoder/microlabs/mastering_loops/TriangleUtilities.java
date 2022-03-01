package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows ; i++) {
            triangle += TriangleUtilities.getRow(i) + "\n";
        }

        System.out.println(triangle);
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
        return TriangleUtilities.getTriangle(4);
    }

    public static String getLargeTriangle() {
        return TriangleUtilities.getTriangle(10);
    }
}
