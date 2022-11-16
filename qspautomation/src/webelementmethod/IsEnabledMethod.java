package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-hhcmmkh1/login.do");
		WebElement ele = driver.findElement(By.cssSelector("a[id='loginButton']"));
             if(ele.isEnabled())
             {
            	 System.out.println("pass:login button is working");
             }
             else
             {
            	 System.out.println("fail:login button is not working");
             }
             driver.close();
             
             
	}

}
