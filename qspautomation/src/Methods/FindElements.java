package Methods;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Phone");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(list.size());
		for(WebElement r:list)
		{
			System.out.println(r.getText());
			
			
		}
		driver.close();
		


	}
}