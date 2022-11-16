package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-hhcmmkh1/login.do");
		WebElement button = driver.findElement(By.cssSelector("input[type='checkbox']"));
		if(button.isSelected())
		{
			System.out.println("pass:button is selected");

		}
		else
		{
			System.out.println("fail:button is not selected");
		}
		driver.close();
	}


}
