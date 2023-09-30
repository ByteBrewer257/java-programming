/******************************************************************************
 *  Compilation:  javac CMYKtoRGB.java
 *  Execution:    java CMYKtoRGB
 *  Dependency:   None
 *
 * This program takes CMYK color input and converts it to RGB and prints
 *
 ******************************************************************************/
public class CMYKtoRGB {
    public static void main(String[] args) {
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);
        // conversion from CMYK to RGB
        double white = 1 - black;                                     // white = 1 - black
        int red = (int) Math.round(255 * white * (1 - cyan));         // red = 255*white*(1-cyan)
        int green = (int) Math.round((255 * white * (1 - magenta)));  // green=255*white*(1-magenta)
        int blue = (int) Math.round((255 * white * (1 - yellow)));    // blue=255*white*(1-yellow)

        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);
    }
}
