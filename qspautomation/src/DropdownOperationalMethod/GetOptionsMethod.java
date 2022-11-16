package DropdownOperationalMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s=new Select(dropdown);
		s.selectByIndex(6);
		s.selectByValue("625");
		s.selectByVisibleText("Cameras & Photo");
		Thread.sleep(2000);
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		for(WebElement Opt:alloptions)
		{
			System.out.println(Opt.getText());
		}
		driver.close();
		
		
	}

}
