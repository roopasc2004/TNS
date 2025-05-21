package com.tns.day4.secondpackage;

import com.tns.day4.package1.base;

public class Executor {

	public static void main(String[] args) {
		base b1=new base();
		b1.varPrivate=40;
		b1.varDefault=89;
		b1.varProtected=70;
		b1.varPublic=90;
		b1.methodPublic();

	}

}
