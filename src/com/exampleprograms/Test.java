package com.exampleprograms;

public class Test {
public  static void printShapes(Shapes shapes) {
	shapes.square();
	shapes.rectangle();
	shapes.quadrilateral();
	shapes.sphere();
}
public static void main(String args[]) {
	Shapes s1=new TwoDimensionalShape();
	Shapes s2=new ThreeDimensionalShape();
	printShapes(s1);
	printShapes(s2);
	
}
}
