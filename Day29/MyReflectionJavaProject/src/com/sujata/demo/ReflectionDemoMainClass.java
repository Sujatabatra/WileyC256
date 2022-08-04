package com.sujata.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemoMainClass {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		ReflectionDemoClass obj=new ReflectionDemoClass();
		System.out.println(" Class Name : "+obj.getClass());
		
		Class classObj=obj.getClass();
		
		Constructor constructor=classObj.getConstructor();
		
		System.out.println("Constructor Name : "+constructor.getName());
		
		System.out.println("Constructor no of parameters : "+constructor.getParameterCount());
		
		Method[] methods=classObj.getMethods();
		for(Method method:methods) {
			System.out.println("method name : "+method.getName()+" with "+method.getParameterCount()+" arguments");
		}
		
		Method methodCall=classObj.getDeclaredMethod("display", int.class);
		
		try {
			methodCall.invoke(obj, 25);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}

}
