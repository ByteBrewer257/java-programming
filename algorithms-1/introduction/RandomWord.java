/******************************************************************************
 *  Compilation:  javac RandomWord.java
 *  Execution:    java RandomWord
 *  Dependency:   algs4.jar
 *
 * Program takes two names input from command line and prints Hello and GoodBye
 * messages on standard output
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String word = "";
        int i = 1;
        while (!StdIn.isEmpty()) {
            String nextWord = StdIn.readString();
            double p = 1.0 / (double) i;
            i++;
            if (StdRandom.bernoulli(p)) {
                word = nextWord;
            }
        }
        StdOut.println(word);
    }
}
