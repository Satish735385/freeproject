package readExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValiedLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=h8g0r7ihqle95");
		Thread.sleep(2000);
		Flib filb = new Flib();
		String validusername = filb.readExcelData("./data/testdata.xlsx", "validdata", 1, 0);
		driver.findElement(By.name("username")).sendKeys(validusername);
		String validpassword = filb.readExcelData("./data/testdata.xlsx", "validdata", 1, 1);
		driver.findElement(By.name("pwd")).sendKeys(validpassword );
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		
		
	}

}
