package com.java.interfaceexample;

public abstract  class  Birds implements Animals {

}
class Hen extends Birds{

	@Override
	public int getSpeed() {
		return 5;
	}
}
	class Sparrow extends Birds{

		@Override
		public int getSpeed() {
			return 0;
		}
	}
		class Crow extends Birds{

			@Override
			public int getSpeed() {
				return 0;
			}
}
	