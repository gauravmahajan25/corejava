package afi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ArraySumPair {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };

		System.out.println(numberOfPairs(a, 3));
	}

	static int numberOfPairs(int[] a, long k) {
		int result = 0;
		int low = 0;
		// System.out.println(a.length);
		int high = a.length - 1;
		int mid = low + ((high - low) / 2);

		while (low <= high) {
			int sum = a[low] + a[high];
			if (sum == k) {
				result++;

				low++;
				high--;
			}

			if (sum < k) {
				low++;
			}

			if (sum > k) {
				high--;
			}

		}

		return result;

	}

}
