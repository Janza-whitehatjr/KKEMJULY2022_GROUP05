package com.math.sample;

public class MyCompoundInterest {
	
	double compundInterest(double p,float n, float r)
	{
		double ci=p*(Math.pow(1+r/100,n))- p;
		//System.out.println("compound interest=" + ci);
		return ci;
			
	}

}
