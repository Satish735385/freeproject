package Assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateValuneDropdown 
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select s=new Select(dropdown);
		//all options of dropdown
		List<WebElement> ops = s.getOptions();
		HashSet<String> set = new HashSet<String>();
		for(int i=0;i<ops.size();i++)
		{
			WebElement allopt=ops.get(i);
			String text=allopt.getText();
			set.add(text);
		}
		for(String se:set)
		{
			System.out.println(se);
		}
	}

}
