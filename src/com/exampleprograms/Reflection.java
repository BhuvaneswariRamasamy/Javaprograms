package com.exampleprograms;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	public static void main(String args[]) {
		try {
			Class cls=Class.forName("com.exampleprograms.Employee");
			Constructor cons[]=cls.getDeclaredConstructors();
			for(int i=0;i<cons.length;i++) {
				System.out.println(cons[i]);
			}
			Employee emp=(Employee)cons[1].newInstance(10,"Bhuvana",20000);
			System.out.println(emp);
			Field fields[]=cls.getDeclaredFields();
			for(int i=0;i<fields.length;i++) {
				System.out.println(fields);
			}
			Method met[]=cls.getDeclaredMethods();
			for(int i=0;i<met.length;i++) {
//              System.out.println(met[i]);
				if(met[i].getName().indexOf("getSalary")!= -1) {
					met[i].setAccessible(true);
					System.out.println(met[i]);
					met[i].invoke(emp);
				}
			}
		}catch(Exception e){
		
		}
	}
}
