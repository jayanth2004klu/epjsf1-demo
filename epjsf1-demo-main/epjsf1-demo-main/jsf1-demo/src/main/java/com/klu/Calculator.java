package com.klu;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="calci", eager=true)
public class Calculator {
	int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	int b;
	int c;
	public void add()
	{
		c=a+b;
	}
	

}
