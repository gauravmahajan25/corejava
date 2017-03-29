package afi;
import java.util.Scanner;

public class SearchTextInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String source = "This is source String. Find text in this source text.";
		String text = "text";

		//String reverseInput= "pqr.mno";
		//searchTextInString(source, text);
		//findLargestPalindrome("text");

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i < n; i++){
            System.out.println(reverseWordsInString(in.next()));
        }
	}

	public static void searchTextInString(String str, String text) {


		for (int index = str.indexOf(text); index >0 ; index = str.indexOf(text, index+1)) {
			System.out.println("Index == " + index);
			System.out.println(str.substring(index, index+ text.length()));
			
		}

	}
	
	//TODO
	/*public static void findLargestPalindrome(String str) {
		StringBuilder strBuilder = new StringBuilder("");
			for (int i =0; i < str.length(); i++) {
			    if (str.charAt(i) == str.charAt(str.length()-1-i)) {
			    	strBuilder.append(str.charAt(i));
			    } else {
			    	strBuilder = new StringBuilder("");
			    }
			}
			
			System.out.println(strBuilder);
	}*/
	
	public static StringBuilder reverseWordsInString(String str) {
		
		String [] originalWords = str.split("\\.");
		//System.out.println("orignial Words =="+originalWords[0]);
		StringBuilder finalString = new StringBuilder();
		for (int index = 0; index < originalWords.length; index++) {
			finalString.append(reverseString(originalWords[index]));
			
			if (index != originalWords.length-1){
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
