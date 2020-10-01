package org.simplilearn.calci;

import junit.framework.Assert;
import junit.framework.TestCase;


public class CalculatorTest extends TestCase {
	
	public void testAdd()
	{
		Calculator calculator = new Calculator();
		int sum=calculator.add(10, 40);
		Assert.assertEquals(50, sum);
		
	}
	public void testDiv()
	{
		Calculator calculator = new Calculator();
		int quotient=calculator.divide(40, 0);
		Assert.assertEquals(0, quotient);
		
	}
	

}
