package com.exampleprograms;

public class TwoDimensionalShape extends Shapes {

	@Override
	public void square(){
		double area,perimeter,side=6;
		area=side*side;
		perimeter=4*side;
		System.out.println(area);
		System.out.println(perimeter);
		
	
	}

	@Override
	public void rectangle() {
		int area,perimeter,length=5,width=4;
		area=length*width;
		perimeter=((2*length)+(2*width));
		System.out.println(area);
		System.out.println(perimeter);
		
		
	}

}
