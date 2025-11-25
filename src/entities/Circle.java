package entities;

import entities_enum.Color;

public class Circle extends AbstractShape{
	
	private double radius;
	
	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public final double area() {
		double area;
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	
}
