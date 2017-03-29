package afi;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int arr[] = { 21, -1, 4, 11, 22, 33 };

		bubbleSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[i+1]) {
				System.out.println(arr[i+1]);
				break;
			}
		}

	}
	
	
	public static void  bubbleSort(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
