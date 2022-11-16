package SelectAndDeselectMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectedAndDeselectedMethod 
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
		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("it is not multiple selected dropdown");
		}
	}

}

