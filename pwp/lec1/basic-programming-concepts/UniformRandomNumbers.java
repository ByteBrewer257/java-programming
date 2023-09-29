
/******************************************************************************
 *  Compilation:  javac UniformRandomNumbers.java
 *  Execution:    java UniformRandomNumbers
 *  Dependency:   None
 *
 *  Prints 5 random numbers, their avg, max and min
 *
 ******************************************************************************/
public class UniformRandomNumbers {
	public static void main(String[] args) {
		double sum = 0.0d;	// sum stores sum of generated random numbers and will be used to compute avg

		double rand = Math.random();
		System.out.println("First random number - " + rand);
		sum += rand;
		double min = rand; 	// min will store minimum of generated numbers
		double max = rand;	// max will store maximum of the generated numbers

		rand = Math.random();
		System.out.println("Second random number - " + rand);
		sum += rand;
		max = Math.max(max, rand);
		min = Math.min(min, rand);

		rand = Math.random();
		System.out.println("Third random number - " + rand);
		sum += rand;
		max = Math.max(max, rand);
		min = Math.min(min, rand);

		rand = Math.random();
		System.out.println("Fourth random number - " + rand);
		sum += rand;
		max = Math.max(max, rand);
		min = Math.min(min, rand);

		rand = Math.random();
		System.out.println("Fifth random number - " + rand);
		sum += rand;
		max = Math.max(max, rand);
		min = Math.min(min, rand);

		System.out.println("avg is - " + sum/5);
		System.out.println("min is - " + min);
		System.out.println("max is - " + max);
	}
}
