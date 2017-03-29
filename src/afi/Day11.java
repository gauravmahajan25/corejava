package afi;
import java.util.Scanner;

public class Day11 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int row=0; row<4; row++) {
        	for (int column = 0; column < 4; column++){
        		int firstRowSum = arr[row][column]+arr[row][column+1]+arr[row][column+2];
        		int secondRowSum = arr[row+1][column+1];
        		int thirdRowSum = arr[row+2][column]+arr[row+2][column+1]+arr[row+2][column+2];
        		
        		currentSum = firstRowSum + secondRowSum + thirdRowSum;
        		
        		maxSum = (currentSum > maxSum) ? currentSum : maxSum;
        		
        	}
        }
        
        System.out.println(maxSum);
	}

}
