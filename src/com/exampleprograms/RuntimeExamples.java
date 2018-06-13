package com.exampleprograms;

import java.io.IOException;
import java.util.Arrays;

public class RuntimeExamples {
public static void main(String args[])  {
	long start=System.currentTimeMillis();
	long startNano=System.nanoTime();
	
	Runtime runtime=Runtime.getRuntime();
	int pro=runtime.availableProcessors();
	System.out.println(pro);
	long end=System.currentTimeMillis();
	long endNano=System.nanoTime();
	System.out.println(end-start);
	System.out.println(end-startNano);
	System.out.println(System.getenv());
	int one[]= {23,16,57,78};
	int two[]=new int[one.length];
	System.arraycopy(one, 0, two, 0, one.length);
	System.out.println(Arrays.toString(two));
//	try {
//		Process process=runtime.exec("notepad");
//		
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
//}
}
}