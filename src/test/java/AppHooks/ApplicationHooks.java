package AppHooks;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.utilities.ConfigRedar;

import PageFactory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ApplicationHooks {
	private Driverfactory drivefactory;
	private WebDriver driver;
	private ConfigRedar configredar;
	Properties prop;
	
	@Before(order = 0)
	public void get_property() throws Throwable  {
		configredar =new ConfigRedar();
		prop=configredar.ini_prop();
		
	}
	@Before(order = 1)
	public void lunchbrowser() {
	String browsername	=prop.getProperty("browser");
	drivefactory=new Driverfactory();
	driver=drivefactory.ini_driver(browsername);
	
	}
	@After(order = 0)
	public void quitbrowser() {
		driver.quit();
		
	}
	@After(order = 1)
	public void Teardown(Scenario sc) {

	}
	

}
