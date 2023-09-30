/******************************************************************************
 *  Compilation:  javac HelloGoodbye.java
 *  Execution:    java HelloGoodbye
 *  Dependency:   None
 *
 *  Takes two names from command line and prints hello and goodbye messages
 *
 ******************************************************************************/

public class HelloGoodbye {
    public static void main(String[] args) {
        String firstName = args[0];
        String secondName = args[1];
        String helloMessage = "Hello " + firstName + " and " + secondName + ".";
        System.out.println(helloMessage);
        String goodByeMessage = "Goodbye " + secondName + " and " + firstName + ".";
        System.out.println(goodByeMessage);
    }
}
