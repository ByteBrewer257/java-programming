/******************************************************************************
 *  Compilation:  javac RightTriangle.java
 *  Execution:    java RightTriangle
 *  Dependency:   None
 *
 *  Takes three integers and checks if these three side forms a right-angled triangle
 *
 ******************************************************************************/

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean hasNonZeroLengthSide = (a > 0 && b > 0 && c > 0);
        boolean isRightAngled = ((a * a) == (b * b) + (c * c)) ||
                ((b * b) == (a * a) + (c * c)) || ((c * c) == (a * a) + (b * b));
        boolean isRightAngledTriangle = (hasNonZeroLengthSide) && isRightAngled;
        System.out.println(isRightAngledTriangle);
    }
}
