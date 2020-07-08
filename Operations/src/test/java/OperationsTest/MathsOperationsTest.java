
package OperationsTest;

import org.junit.Assert;
import org.junit.Test;

import OperationClass.MathsOperations;

public class MathsOperationsTest {	
	
	@Test
	public void testAdd()
	{
		MathsOperations math=new MathsOperations();
		Assert.assertEquals("Test failed",3,math.add(1,2));
		Assert.assertEquals("Test failed",5,math.add(3,2));
	}
}
