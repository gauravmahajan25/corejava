package afi;
import java.util.Scanner;

/**
 * Solution to hacker rank No OF Square problem.
 * @author Gaurav M
 *
 */
public class CalcualateNoOfSquares {
	
	public static void main (String [] s) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] numbers = new int[n];
		for (int i=0; i<n; i++) {
			numbers[i] = scan.nextInt();
		}
		
		
		for (int i = 0; i < numbers.length; i++) {
			long numberOfSquares = ((numbers[i]*numbers[i] + numbers[i]) * (2*numbers[i] + 1))/6;
			
			System.out.println(numberOfSquares);
		}
		
	
	}

}
