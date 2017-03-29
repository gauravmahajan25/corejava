package afi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestPrivateMethods {

	public static void callPrivate() throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		ArraySumPair a = new ArraySumPair();

		Method m = a.getClass().getDeclaredMethod("zombieCluster", null);

		m.setAccessible(true);
		m.invoke(a);
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		callPrivate();
	}
}
