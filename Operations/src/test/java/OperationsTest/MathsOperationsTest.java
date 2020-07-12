
package OperationsTest;

import org.junit.Assert;
import org.junit.Test;

import OperationClass.MathsOperations;

public class MathsOperationsTest {	
	
	MathsOperations math=new MathsOperations();
	
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
	
	@Test
	public void testAdd4()
	{
		Assert.assertEquals("Test failed",0,math.add(0,0));
	}
}
