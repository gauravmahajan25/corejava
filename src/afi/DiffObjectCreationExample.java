package afi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DiffObjectCreationExample {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		DiffObjectCreationExample type1 = new DiffObjectCreationExample();
		
		DiffObjectCreationExample type2 = (DiffObjectCreationExample) Class.forName("DiffObjectCreationExample").newInstance();
		
		DiffObjectCreationExample type3 = (DiffObjectCreationExample) type2.clone();
		
		DiffObjectCreationExample type4 = (DiffObjectCreationExample) DiffObjectCreationExample.class.getClassLoader().loadClass("DiffObjectCreationExample").newInstance();
		
		//From Serialization readObject method
		
		Class c1 = DiffObjectCreationExample.class;
		
		Constructor constructor = c1.getDeclaredConstructors()[0];
		
		DiffObjectCreationExample type6 = (DiffObjectCreationExample) constructor.newInstance();
		
		
	}

}
