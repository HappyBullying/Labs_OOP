
package ru.mirea.laba_2;
public class Circle {
	public double CircleRadius1;
	
	Circle(double r){
		CircleRadius1 = r;
	}
	private double CircleRadius;
	
	public void CR_set(double r) {
		this.CircleRadius1 = r;
	}
	
	public double CR_get() {
		return this.CircleRadius1;
	}

}
