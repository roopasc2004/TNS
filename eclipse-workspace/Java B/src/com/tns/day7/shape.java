package com.tns.day7;

public abstract class shape {
	protected float area;
	abstract void calArea();
	void show()
	{
		System.out.println("the area is:"+area);
	}
}
