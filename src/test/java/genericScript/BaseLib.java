package genericScript;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseLib {
	public WebDriver wdriver;
	public EventFiringWebDriver driver;
	public FileInputStream file1;
	public Properties prop1;
		
	@BeforeTest
	@Parameters("browser")
	public void openBrowser(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe");
		wdriver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\geckodriver.exe");
					wdriver=new FirefoxDriver();
		}
		driver=new EventFiringWebDriver(wdriver);
		wdriver.manage().window().maximize();
		Thread.sleep(2000);
		file1=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\env.properties");
		prop1 = new Properties();
		prop1.load(file1);
		driver.get(prop1.getProperty("url1"));
		Thread.sleep(4000);
		System.out.println("pageOpen");
		String parent=wdriver.getWindowHandle();
		System.out.println(parent);
		driver.switchTo().window(parent);
		//driver.navigate();
}
@AfterTest	
public void closeBrowser()
{
wdriver.quit();
}
}
