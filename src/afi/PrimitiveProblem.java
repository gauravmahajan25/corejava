package afi;
import java.util.Scanner;

public class PrimitiveProblem {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        // your code goes here
        
        int [] arr = new int[p];
        
        for (int i=1; i<p; i++) {
        	
        	for (int j =1; j < p; j++) {
        	
        	int gx = (int) Math.pow(i, j-1);
        	
        	//System.out.println("gx == "+gx);
        	
        	int gxmodp = gx/p;
        	//System.out.println(gxmodp);
        	arr[i-1] = gxmodp;
        	}
        }
        
        for (int i=0; i<p; i++) {
        System.out.println(arr[i]);
        }
		
	}

}
