package afi;

import java.util.Arrays;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 32, 22 };

		//removeElement(arr, 32);
		
		removeUsingArrayCopy(arr, 3);

	}

	public static void removeElement(int[] arr, int element) {
		int elementIndex = -1;
		
		int[] result = new int[arr.length - 1];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == element) {
				elementIndex = index;
				break;
			}
		}

		if (elementIndex >= 0) {
			for (int index = elementIndex; index < arr.length-1; index++) {
				arr[index] = arr[index+1];
			}
		}

		for (int index=0; index < result.length; index++) {
			result[index] = arr[index];
		}
		
		for (int index=0; index < result.length; index++) {
			System.out.println(result[index]);
		}
	}
	
	
	public static void removeUsingArrayCopy(int[] arr, int removeIndex) {
		System.out.println(arr.length);
		System.out.println(removeIndex);
		
		int numberOfElementsTobeShifted = arr.length - (removeIndex + 1);
		
		System.out.println(numberOfElementsTobeShifted);
		System.arraycopy(arr, removeIndex+1, arr, removeIndex, numberOfElementsTobeShifted);
		

		System.out.println(Arrays.toString(arr));
	}
}
