package com.math.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {
	
 MyPerimeter obj=new MyPerimeter();
 MySimpleInterest objs=new MySimpleInterest();
 MyCompoundInterest objc=new MyCompoundInterest();
 MySwap objswp=new MySwap();
	@Test
	public void test() {
		float pout=obj.perimeter(2.1f, 2.2f);
	assertEquals(8.6f,pout,0.0f);
	
	}
	@Test
	public void testsi()
	{
		float sout=objs.simpleinterest(2000f, 2.5f, 10.5f);
		assertEquals(525,sout,0.0f);
	}
	@Test
	public void testci()
	{
	double cout=objc.compundInterest(2000, 2.5f, 10.5f)	;
	assertEquals(567.0581,cout,0.5f);
	}
	@Test
	public void testswap()
	{
		
	int outs=objswp.swap(10, 15);
	assertEquals(15,outs);
	
		/*int[] num= {10,15};
		objswp.swp(num);
		assertEquals(15,num[0]);
		assertEquals(10,num[1]); */
	
	}

}
