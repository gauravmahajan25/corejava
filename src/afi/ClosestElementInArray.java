package afi;

/**
 * Demonstrating the closest element in array problem.
 * @author Vihaan
 *
 */
public class ClosestElementInArray {

	public static void main(String[] args) {

		int K = 4, X = 5;

		int arr[] = { 12, 16, 22, 30, 31, 35, 39, 42, 45, 48, 50, 53, 55, 56 };

		closest(arr, K, X);
	}

	public static void closest(int[] arr, int k, int x) {

		int leftIndex = x - 1;
		int rightIndex = x + 1;

		int numberOfELementsAdded = 0;
		// index out of bound
		while (leftIndex >= 0 && rightIndex < arr.length && numberOfELementsAdded < k) {
			// Current Element being duplicated

			while (arr[leftIndex] == arr[x]) {
				System.out.println(arr[leftIndex]);
				leftIndex--;
				numberOfELementsAdded++;
				continue;
			}

			while (arr[rightIndex] == arr[x]) {
				System.out.println(arr[leftIndex]);
				rightIndex++;
				numberOfELementsAdded++;
				continue;
			}

			if (arr[x] - arr[leftIndex] <= arr[rightIndex] - arr[x]) {
				System.out.println(arr[leftIndex]);
				leftIndex--;
				numberOfELementsAdded++;
			} else {
				System.out.println(arr[rightIndex]);
				rightIndex++;
				numberOfELementsAdded++;
			}
		}

	}

}
