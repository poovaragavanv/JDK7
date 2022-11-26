package com.hasa;

public class Sample {
	final double pi;

	public Sample() {
		pi = 3.14;
	}

	public Sample(double pi) {
		this.pi = pi;
	}

	public static void main(String args[]) 
	{
		Sample ob = new Sample(22 / 7);
		System.out.println(ob.pi);
	}

}
