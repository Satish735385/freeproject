package dataDrivenFramework;


import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestActitimeInvalidLogin 
{

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=h8g0r7ihqle95");
		Flib flib = new Flib();

		int rc=flib.getRowCountMethod("./data/testdata.xlsx","invaliddata");
		for(int i=1;i<=rc;i++)
		{
			String invalidusername=flib.readExcelData1("./data/testdata.xlsx\",\"invaliddata",i,0);
			driver.findElement(By.name("username")).sendKeys(invalidusername);
			String invalidpassword=flib.readExcelData1("./data/testdata.xlsx\",\"invaliddata",i,1);
			driver.findElement(By.name("username")).sendKeys(invalidpassword);
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("a[id='loginButton']")).click();
			driver.findElement(By.name("username")).clear();
			

		}
	}
}






