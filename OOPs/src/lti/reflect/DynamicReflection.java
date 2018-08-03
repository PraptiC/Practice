package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicReflection {
	public static void main(String[] args) throws Exception {
		String qcn = "lti.reflect.Customer";
		
		// Manually Loading the class
		Class custClass=Class.forName(qcn);
		
		//getting thw parameterised constructor
		Constructor custConst = custClass.getConstructor(String.class);
		
		//Instantiating with parameterised Constructor
		Object obj = custConst.newInstance("Shilpa");
		System.out.println(obj);
		
		//Getting private method of class
		Method printMethod = custClass.getDeclaredMethod("print",null);
		
		//Calling print method on customer object
		printMethod.setAccessible(true);
		printMethod.invoke(obj, null);
	}

}
