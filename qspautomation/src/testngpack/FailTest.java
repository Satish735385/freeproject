package testngpack;

import org.testng.annotations.Test;

public class FailTest 
{
  @Test
  public void demo() 
  {
	  int i=0;
	  int result=5/i;
	  System.out.println(result);
	  System.out.println("i am frome demo method");
  }
}
