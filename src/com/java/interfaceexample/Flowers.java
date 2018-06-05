package com.java.interfaceexample;

public abstract class Flowers implements Animals {

}
class Lily extends Flowers{

	@Override
	public int getSpeed() {
      return 34;
     
		}
}
	class Lotus extends Flowers{

		@Override
		public int getSpeed() {
	      return 0;
			}
	}
		class Jasmine extends Flowers{

			@Override
			public int getSpeed() {
		      return 0;
				}
		}		
