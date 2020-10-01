package org.simplilearn.calci;

public class Calculator {

	public int add(int i, int j)
	{
	return i+j;
	}
	
	public int divide(int i, int j)
	{
	if (j==0)
		return 0;
		else
	return i/j;
	}
	
	
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		int sum=calculator.add(10, 20);
		System.out.println("sum is "+sum);
		int div=calculator.divide(20,4);
		System.out.println("Quotient is "+div);

	}

}
