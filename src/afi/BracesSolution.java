package afi;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Class demonstrating the solution to brace validation problem using stack.
 * 
 * @author Gaurav M
 *
 */

public class BracesSolution {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		final String filename = System.getenv("OUTPUT_PATH");
		BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

		String[] res;

		int _values_size = 0;
		String[] _values = new String[_values_size];
		String _value_item;

		for (int _value_i = 0; _value_i < _values_size; _value_i++) {
			try {
				_value_item = in.nextLine();
			} catch (Exception e) {
				_value_item = null;
			}

			_values[_value_i] = _value_item;
		}

		res = braces(_values);

		for (int res_i = 0; res_i < res.length; res_i++) {
			bw.write(String.valueOf(res[res_i]));
			bw.newLine();
		}

		bw.close();

	}

	static String[] braces(String[] values) {
		String[] result = new String[values.length];

		String value;
		for (int index = 0; index < result.length; index++) {
			value = values[index];
			result[index] = getBalancedValueResult(value);
		}

		return result;

	}

	private static String getBalancedValueResult(String value) {

		// Even size
		Stack<Character> chStack = new Stack<Character>();
		if (value.length() % 2 != 0)
			return "NO";

		else {

			for (int index = 0; index < value.length(); index++) {
				char ch = value.charAt(index);

				if (ch == '[' || ch == '{' || ch == '(') {
					chStack.push(ch);
				} else if (ch == ']') {
					if (chStack.isEmpty()) {
						return "NO";
					}

					if (chStack.pop() != '[') {
						return "NO";
					}

				}

				else if (ch == '}') {
					if (chStack.isEmpty()) {
						return "NO";
					}

					if (chStack.pop() != '{') {
						return "NO";
					}

				}

				else if (ch == ')') {
					if (chStack.isEmpty()) {
						return "NO";
					}

					if (chStack.pop() != '(') {
						return "NO";
					}

				}
			}

			return chStack.isEmpty() ? "YES" : "NO";
		}
	}

}
