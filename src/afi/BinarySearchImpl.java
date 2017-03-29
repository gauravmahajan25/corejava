package afi;

import java.util.ArrayList;

public class BinarySearchImpl {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 5, 6, 9 };
		int a2 [] = {2, 3,4, 5, 9};

		//System.out.println(search(arr, 4));
		//System.out.println(searchFirstElementGTGivenNum(arr, 1));
		
		Object[] c = intersectionOfArrays(arr, a2);
		
		for (int i =0; i < c.length; i++) {
			System.out.println("Common Element == " +c[i]);
		}
		
	}

	public static int search(final int[] arr, final int num) {
		int length = arr.length - 1;
		int startIndex = 0;
		int mid;

		while (startIndex <= length) {
			mid = (startIndex + length) / 2;

			if (arr[mid] < num) {
				startIndex = mid + 1;
			} else if (arr[mid] == num) {
				return mid;
			} else {
				length = mid - 1;
			}

		}
		return -1;
	}

	public static int searchFirstElementGTGivenNum(final int[] arr, final int num) {
		int length = arr.length - 1;
		int startIndex = 0;
		int mid;

		while (startIndex <= length) {
			mid = (startIndex + length) / 2;

			if (arr[mid] < num) {
				startIndex = mid + 1;
			} else if (arr[mid] == num && mid < arr.length - 1) {
				return arr[mid + 1];
			} else {
				length = mid - 1;
			}

		}
		return -1;
	}
	
	public static Object[] intersectionOfArrays(int [] a1, int [] a2) {
		int commonArrayLength = a1.length > a2.length ? a1.length : a2.length;
		ArrayList<Integer> output = new ArrayList<>();
		
		for (int aIndex = 0 ; aIndex < commonArrayLength; aIndex++) {
			int elementIndex = search(a2, a1[aIndex]) ;
			if (elementIndex!= -1) {
				output.add(a2[elementIndex]);
			}
		}
		
		return output.toArray();
	}

}
