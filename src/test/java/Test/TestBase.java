package Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class TestBase {

	public static WebDriver driver ;

	@BeforeTest
	@Parameters ({"browser"})
	public void startDriver(@Optional ("chrome") String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver(chromeOptions);
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

				driver.manage().window().maximize();
		driver.get("https://frontend.oetest2.tech/ar/user/login");

	}	


	@AfterSuite
	public void stopDriver() {
//		driver.quit();

	}
}
