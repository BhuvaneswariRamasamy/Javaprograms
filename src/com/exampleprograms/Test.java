package com.exampleprograms;

public class Test {
public  static void printShapes(FindPassword shapes) {
	shapes.square();
	shapes.rectangle();
	shapes.quadrilateral();
	shapes.sphere();
}
public static void main(String args[]) {
	FindPassword s1=new TwoDimensionalShape();
	FindPassword s2=new ThreeDimensionalShape();
	printShapes(s1);
	printShapes(s2);
	
}
}
