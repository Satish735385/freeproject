package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag3 {
  @Test (priority =1)
  public void loginMethod() 
  {
	  Reporter.log("login users..",true);
  }
  @Test (priority =2)
  public void createuser() 
  {
	  Reporter.log("create user..",true);
  }
  @Test (priority =3)
  public void logoutMethod() 
  {
	  Reporter.log("log out user ..",true);
  }
}
