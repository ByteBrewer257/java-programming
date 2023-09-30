
/******************************************************************************
 *  Compilation:  javac ThreeSort.java
 *  Execution:    java ThreeSort
 *  Dependency:   None
 *
 *  Takes three integers from command line and prints them in ascending order 
 *
 ******************************************************************************/
public class ThreeSort {
	public static void main(String[] args) {
		int sum = 0, min, max;
		int temp = Integer.parseInt(args[0]);
		sum += temp;
		min = temp; 
		max = temp; 
		temp = Integer.parseInt(args[1]);
		sum += temp;
		min = Math.min(temp, min);
		max = Math.max(temp, max);
		temp = Integer.parseInt(args[2]);
		sum += temp;
		min = Math.min(temp, min);
		max = Math.max(temp, max);

		System.out.println(min + ", " + (sum - min - max) + ", " + max);
	}
}
