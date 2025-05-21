package com.tns.day7;

public class Square extends shape {
	private float side;
	public Square() {
		side=2.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}
   void calArea() {
	   area=side*side;
   }
}
