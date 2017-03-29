package afi;
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i < n; i++){
            System.out.println(reverseWordsInString(in.next()));
        }
	}
	
	public static StringBuilder reverseWordsInString(String str) {
		
		String [] originalWords = str.split("\\.");
		
		StringBuilder finalString = new StringBuilder();
		for (int index = originalWords.length - 1; index >= 0 ; index--) {
			finalString.append((originalWords[index]));
			
			if (index != 0){
				finalString.append(".");
			}
		}
		
		return finalString;
	}

	private static StringBuilder reverseString(String str) {
		StringBuilder reverseString = new StringBuilder();
		
		for (int index = str.length()-1; index >=0; index--) {
			reverseString.append(str.charAt(index));
		}
		
		return reverseString;
		
	}

}