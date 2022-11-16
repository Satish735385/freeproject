package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 
{
  @Test (enabled=false)
  public void lginMethod() 
  {
	  Reporter.log("login user ..",true);
  }
  @Test(enabled=true)
  public void createuser() 
  {
	  Reporter.log(" create user ..",true);
  }
}
