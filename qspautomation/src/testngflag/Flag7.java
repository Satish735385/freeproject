package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag7 {
  @Test
  public void loginmethod() 
  {
	  Reporter.log("login user..",true);
  }
  @Test(dependsOnMethods="loginmethod",alwaysRun=true)
  public void createuser() 
  {
	  Reporter.log("create user..",true);
  }
  @Test(priority=1)
  public void logout() 
  {
	  Reporter.log("log out user..",true);
  }
}