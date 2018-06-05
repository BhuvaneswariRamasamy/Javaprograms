package com.inheritance;

public class TestCar {
public static  void printSpeed(Car myspeed) {
	myspeed.brake();
}
public static void main(String args[]) {
	Car c1=new TaxiCar();
	Car c2=new SportsCar();
	Car c3=new PoliceCar();
	printSpeed(c1);
	printSpeed(c2);
	printSpeed(c3);
}
}
