package testngflag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description="thise method helps of the actitime application ")
  public void loginToActitime() 
  {
	  Reporter.log("Login in.....,true");
  }
  @Test(description="thise method is perform logout ")
  public void Flag2() 
  {
	  Reporter.log("Log out.....,true");
  }
  
}
