package generic;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListner extends BaseTest implements ITestListener 
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		String failedmethod = result.getMethod().getMethodName();
		Reporter.log(" "+failedmethod+"is the method name",true);
		try {
			failed(failedmethod);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
	
	}

}
