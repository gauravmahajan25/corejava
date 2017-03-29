package afi;

/**
 * 
 * Given two strings s (search string) and T (text), find all occurrences of s in T.
 */

public class SearchSubString {
	
	public static void main(String[] args) {
		
		String text = "Hello, asdd hello Hello";
		
		String search = "Hello";
		
		int finalstr = text.lastIndexOf("Hello");
		System.out.println("Search String == "+finalstr);
		SearchSubString s = new SearchSubString();
		System.out.println(s instanceof Object);
		
		/*for (int i = 0; i < finalstr.length; i++) {
			System.out.println("Search String == "+finalstr[i]);
		}
		*/
	}
	
	

}
