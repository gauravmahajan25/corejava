package afi;
import java.util.Scanner;

/**
 * Hacker Rank Compare triplets problems.
 * @author Gaurav M
 *
 */
public class CompareTriplets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int aSum = 0;
        int bSum = 0;
        
        if (a0 > b0) 
        	aSum++;
        if (a1 > b1)
        	aSum++;
        if (a2 > b2)
        	aSum++;
        if (a0 < b0) 
        	bSum++;
        if (a1 < b1)
        	bSum++;
        if (a2 < b2)
        	bSum++;
        
        System.out.println(aSum +" "+ bSum);

	}

}
