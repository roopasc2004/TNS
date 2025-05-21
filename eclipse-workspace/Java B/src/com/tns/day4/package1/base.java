package com.tns.day4.package1;

public class base {
	int varDefault=10;
	public int getVarDefault() {
		return varDefault;
	}
	public void setVarDefault(int varDefault) {
		this.varDefault = varDefault;
	}

	public int varPublic=20;
	public int varPrivate=30;
	protected int varProtected=80;
	
	public int getVarPrivate() {
		return varPrivate;
	}
	public void setVarPrivate(int varPrivate) {
		this.varPrivate=varPrivate;
	}

	void methodDefault()
	{
		System.out.println("iam a default method");
		System.out.println("Default Variable : "+varDefault);
	}

	public void methodPublic()
	{
		System.out.println("iam a public method");
		System.out.println("public Variable : "+varPublic);
	}

	private void methodPrivate()
	{
		System.out.println("iam a private method");
	System.out.println("private Variable : "+varPrivate);
	}

	protected void methodProtected()
	{
		System.out.println("iam a protected method");
		System.out.println("protected Variable : "+varProtected);
	}

	}


