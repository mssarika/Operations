
package OperationsTest;

import org.junit.Assert;
import org.junit.Test;

import OperationClass.MathsOperations;
import OperationClass.Operations;
import OperationClass.PublicOperation;

public class OperationsUnitTest {	
	
	Operations math=new Operations();
	
	@Test
	public void testAdd()
	{
		Assert.assertEquals("Test failed",3,math.add(1,2));
	}
	
	@Test
	public void testAdd1()
	{
		Assert.assertEquals("Test failed",-1,math.add(1,-2));
	}
	
	@Test
	public void testAdd2()
	{
		Assert.assertEquals("Test failed",1,math.add(-1,2));
	}
	
	@Test
	public void testAdd3()
	{
		Assert.assertEquals("Test failed",-3,math.add(-1,-2));
	}
	
/*	@Test
	public void testAdd4()
	{
		Assert.assertEquals("Test failed","abc",math.add("ab","c"));
	}
	
	@Test
	public void testAdd5()
	{
		Assert.assertEquals("Test failed","abcdef",math.add("abc","def"));
	}*/
}
