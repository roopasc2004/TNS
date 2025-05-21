package com.tns.day4.package1;

public class Executor {

	public static void main(String[] args) {
	   base b1=new base();
			
				b1.varDefault=40;
				b1.varPublic=70;
				b1.varProtected=90;
				b1.setVarPrivate=(80);//private cannot be used..but using getter-setter,we can use
				
				b1.methodDefault();
				b1.methodPrivate();
				b1.methodProtected();
				b1.methodPublic();


			}

		}
	


