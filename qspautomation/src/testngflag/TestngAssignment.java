package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngAssignment 
{
	@Test (priority=0)
	public void z () 
	{
		Reporter.log("z method",true); 
	}
	@Test(priority=7)
	public void w() 
	{
		Reporter.log(" w method",true); 
	}
	@Test(priority=5)
	public void a () 
	{
		Reporter.log("a method",true); 
	}
	@Test
	public void c () 
	{
		Reporter.log("c method",true); 
	}
	@Test
	public void j () 
	{
		Reporter.log("j method",true); 
	}
	@Test(priority=0)
	public void u () 
	{
		Reporter.log("j method",true); 

	}
	@Test(priority=1)
	public void q () 
	{
		Reporter.log("q method",true); 
	}
	@Test(priority=6)
	public void b () 
	{
		Reporter.log(" b method",true); 
	}
	@Test(priority=0)
	public void d() 
	{
		Reporter.log("d  method",true); 
	}
}

