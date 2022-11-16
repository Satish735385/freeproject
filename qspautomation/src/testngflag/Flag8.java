package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag8 {
	@Test(groups = "function testing")
	public void ft1() 
	{
		Reporter.log("Function test case 1 executes",true); 
	}
	@Test(groups="integration testing")
	public void it1() 
	{
		Reporter.log(" integration test case 1 executes",true); 
	}
	@Test(groups="system testing")
	public void st1() 
	{
		Reporter.log("System test case 1 executes",true); 
	}
	//.........................................

	@Test(groups = "function testing")
	public void ft2() 
	{
		Reporter.log("Function test case 2 executes",true); 
	}
	@Test(groups="integration testing")
	public void it2() 
	{
		Reporter.log(" integration test case 2 executes",true); 
	}
	@Test(groups="system testing")
	public void st2() 
	{
		Reporter.log("System test case 2 executes",true); 
	}
	//.................................................................

	@Test(groups = "function testing")
	public void ft3() 
	{
		Reporter.log("Function test case 3 executes",true); 
	}
	@Test(groups="integration testing")
	public void it3() 
	{
		Reporter.log(" integration test case 3 executes",true); 
	}
	@Test(groups="system testing")
	public void st3() 
	{
		Reporter.log("System test case 3 executes",true); 
	}
}