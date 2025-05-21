package com.tns.day5;

public class ConstructorDemo {
	public static void main(String[] args) {
		Customer obj=new Customer("aniket",121,"banglore");
		obj.setCustomerCity("banglore");
		obj.setCustomerID(121);
		obj.setCustomerName("aniket");
		obj.getCustomerCity();
		obj.getCustomerID();
		obj.getCustomerName();
		System.out.println(obj);
	}

}
