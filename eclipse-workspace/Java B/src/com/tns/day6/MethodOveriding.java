package com.tns.day6;

public class MethodOveriding {
	public static void main(String[] args)
	{
		//dynamic binding
      RBI rbi;
   //   HDFC obj=new HDFC();
    //  SBI obj1=new SBI();
      rbi=new SBI();
      System.out.println(rbi.getRateOfInterest());
      rbi=new HDFC();
      System.out.println(rbi.getRateOfInterest());
      rbi=new ICIC();
      System.out.println(rbi.getRateOfInterest());
      
      
      
      
}
	
}