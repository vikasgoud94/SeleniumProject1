package loginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TitleTest {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas.goud\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void Test1()
	{
		driver.get("https://www.google.com/");
		System.out.println("Test 1 title -> "+driver.getTitle());
	}
	
	@Test
	public void Test2()
	{
		driver.get("https://www.google.com/");
		System.out.println("Test 2 title -> "+driver.getTitle());
	}
	
	@Test
	public void Test3()
	{
		driver.get("https://www.google.com/");
		System.out.println("Test 3 title -> "+driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
