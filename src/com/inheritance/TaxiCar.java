package com.inheritance;

public class TaxiCar extends Car {

	@Override
	public void brake() {
		int speed=500;
		System.out.println(speed);
	}

}
