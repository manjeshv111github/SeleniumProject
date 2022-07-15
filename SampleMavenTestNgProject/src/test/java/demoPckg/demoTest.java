package demoPckg;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class demoTest {
	public WebDriver driver =null;
	
	@BeforeMethod(alwaysRun=true)
	@Parameters("browser")
	public void beoreCls(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			
	}
	
	@Test(groups="smoke")
	@Parameters({"username","password"})
	public void LaunchFacebook(String username,String password){
		
		System.out.println("Username "+username);
		System.out.println("Username "+password);
		
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String verifyText = driver.findElement(By.xpath("//img[@alt='Facebook']")).getAttribute("alt");
		System.out.println(verifyText);
		assertEquals(verifyText, "Facebook");
		
		
	}
	
	@Test
	public void LaunchBookmyshow() {
		driver.get("http://www.bookmyshow.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String strtitle = driver.getTitle();
		System.out.println(strtitle);
	}
	
	@Test
	public void LaunchBangalore() {
		
		driver.get("http://www.bangalore.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String strtitle = driver.getTitle();
		System.out.println(strtitle);
	}
	
	
	
	
	@AfterMethod
	public void afterCls() {
		driver.close();
	}
	
}
