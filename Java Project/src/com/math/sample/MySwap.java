package com.math.sample;

public class MySwap {
	//int x,y;
	public int swap(int x,int y)
	{
	int temp;
	temp=x;
	x=y;
	y=temp;
	System.out.println("After swap");
	System.out.println("x=" + x);
	System.out.println("y=" + y);
	return x;
	
	}
 void swp(int[] nums)
{
int a=nums[0];
nums[0]=nums[1];
nums[1]=a;
System.out.println("After swap");
System.out.println("x=" + nums[0]);
System.out.println("y=" + nums[1]);
}
}

