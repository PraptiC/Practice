package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class CustomerReflection {
	public static void main(String[] args) {
		Customer c1 = new Customer("Polo");
		System.out.println(c1);
		Class cc=c1.getClass();
		System.out.println(cc);
		System.out.println("\n\n\nList of constructors\n\n");
		Constructor[] constructors = cc.getConstructors();
		for(Constructor c : constructors) {
			System.out.println(c);
		}
		System.out.println("\n\n\nList of methods\n\n");
		Method[] methods = cc.getMethods();
		for(Method m: methods) {
			System.out.println(m);
		}
		System.out.println("\n\n\nList of declared methods\n\n");

		Method[] deMethods = cc.getDeclaredMethods();
		for(Method m: deMethods) {
			System.out.println(m);
		}
		System.out.println("\n\n\nList of fields\n\n");
		Field[] fields =cc.getFields();
		for(Field f: fields) {
			System.out.println(f);
		}
		
		System.out.println("\n\n\nList of declared fields\n\n");
		Field[] decFields =cc.getDeclaredFields();
		for(Field f: decFields) {
			System.out.println(f);
		}		
	} 
}
