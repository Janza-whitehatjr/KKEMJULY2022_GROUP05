package com.math.sample;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	MySwap objs=new MySwap();
	objs.swap(10, 12);
	MyPerimeter objp=new MyPerimeter();
	float outp=objp.perimeter(2.1f,2.2f);
	System.out.println("Perimeter of Rectange=" + outp);
	MySimpleInterest objsi=new MySimpleInterest();
	float outsi=objsi.simpleinterest(2000, 2.5f, 10.5f);
	System.out.println("Simple Interest=" + outsi);
	MyCompoundInterest objci=new MyCompoundInterest();
	double outci=objci.compundInterest(2000, 2.5f, 10.5f);
	System.out.println("compound interest=" + outci);

	}

}
