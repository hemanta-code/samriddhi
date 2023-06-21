package commonLibs.implementation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import commonLibs.utils.ReadConfig;

public class CommonDriver {

	ReadConfig readConfig = new ReadConfig();

	public static WebDriver driver;
	public String baseUrl = readConfig.getBaseUrl();
	public String email = readConfig.getEmail();
	public String password = readConfig.getPassword();

	public static ElementControl elementControl;

	@BeforeClass
	public void setup() throws InterruptedException {
//		if(browser.equals("chrome")) {
		if(driver==null) {
		System.setProperty("webdriver.chrome.driver", readConfig.getChromePath());
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		}
//		}
//		else if(browser.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver", readConfig.getFirefoxPath());
//			driver = new FirefoxDriver();
//		}
//		else if(browser.equals("edge")) {
//			System.getProperty("webdriver.edge.driver", readConfig.getEdgePath());
//			driver = new EdgeDriver();
//		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		elementControl = new ElementControl(driver);
	}

	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

	
	public String getRandomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	
	public String getRandomNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(6);
		return generatedNumber;
	}
}
