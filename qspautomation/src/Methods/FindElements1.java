package Methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazone.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		ele.sendKeys("phone");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@role='button']"));
		System.out.println(list.size());
		for(WebElement b:list)
		{
			System.out.println(b.getText());
		}
		driver.close();
		

	}

}
