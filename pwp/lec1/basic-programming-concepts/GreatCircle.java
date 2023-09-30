/******************************************************************************
 *  Compilation:  javac GreatCircle.java
 *  Execution:    java GreatCircle
 *  Dependency:   None
 *
 *  Takes coordinate of two points on Earth's surface and calculates distance between them
 *
 ******************************************************************************/

public class GreatCircle {
    public static void main(String[] args) {
        // Inputs are given in degrees but Java's trigonometric functions use radians
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        // Distance will be computed using Haversine formula
        // 2 * r arcsin (sqrt(sin^2((x2-x1)/2) + cos(x1) * cos(x2) * sin^2((y2 - y1)/2)) where r is earth radius
        double RADIUS = 6371.0; // radius of Earth

        double firstSinTerm = Math.pow(Math.sin((x2 - x1) / 2), 2);
        double secondSinTerm = Math.pow(Math.sin((y2 - y1) / 2), 2);
        double secondTerm = Math.cos(x1) * Math.cos(x2) * secondSinTerm;
        double res = 2 * RADIUS * Math.asin(Math.sqrt(firstSinTerm + secondTerm));
        System.out.println(res + " kilometers");
    }
}
