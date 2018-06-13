package com.exampleprograms;

public class Clone {
int x,y;
public Clone() {
	x=10;
	y=20;
}
public static void main(String args[]) {
	Clone clone=new Clone();
	System.out.println(clone.x+" "+clone.y);
	Clone clone2=clone;
	clone2.x=300;
	System.out.println(clone.x+" "+clone.y);
	System.out.println(clone2.x+" "+clone2.y);
}
}
