package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	public WebDriver driver;
	 public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<WebDriver>();
	 
	 public WebDriver ini_driver(String browser) {
		 System.out.println("browser name is"+browser);
		 
		 if (browser.equals("chrome")) {
			// System.setProperty("Webdriver.chrome.driver",
					 //"C:\\\\Users\\\\hp\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
			 WebDriver driver=new ChromeDriver();
			 WebDriverManager.chromedriver().setup();
				tldriver.set(new ChromeDriver());
			}
			else if(browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				tldriver.set(new FirefoxDriver());
			}
			else {
				System.out.println("Please enter the correct browser to launch " + browser);
			}
			
			getDriver().manage().deleteAllCookies();
			getDriver().manage().window().maximize();
			return getDriver();
		}
		
		public static synchronized WebDriver getDriver() {
			return tldriver.get();
		}
		
		
		
		
		 
	 }


