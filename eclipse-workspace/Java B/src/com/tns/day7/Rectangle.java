package com.tns.day7;

public class Rectangle extends shape {
	private float width ,height;
	public Rectangle() {
		this.width=5.0f;
		this.width=2.0f;
		
	}
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
	void calArea() {
		area=width*height;
		
	}

}
