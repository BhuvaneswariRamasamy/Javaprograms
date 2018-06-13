package com.exampleprograms;

public class ThreeDimensionalShape extends FindPassword {

	@Override
	public void quadrilateral() {
		int a=3,b=4,c=5,d=6;
		 int area=((a+b+c+d)/2);
		int perimeter=((a*b)+(b*c)+(c*d)+(d*a));
		System.out.println(area);
		System.out.println(perimeter);
		
	}

	@Override
	public void sphere() {
		double area,perimeter,r=6;
		area=(4*3.14*(r*r));
		perimeter=(4*3.14*(r*r));
		System.out.println(area);
		System.out.println(perimeter);
		
		
	}

	

}
