package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveTest {

	@Test
	
	public void test() 
	{
		Remove ob=new Remove();
		String result=ob.check("AABCD");
		assertEquals("BCD",result);
		
	}
	
	@Test
	public void test1() 
	{
		Remove ob=new Remove();
		String result=ob.check("AA");
		assertEquals("",result);
		
	}
	@Test
	public void test2() 
	{
		Remove ob=new Remove();
		String result=ob.check("");
		assertEquals("",result);
		
	}
	
	
	

}
