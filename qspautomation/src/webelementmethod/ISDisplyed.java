package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISDisplyed {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		if(ele.isDisplayed())
		{
			System.out.println("pass:element is displyed");
			ele.sendKeys("laptop");
		}
		else
		{
			System.out.println("fail:element is not a displyed ");

		}
		driver.close();
	}

}
