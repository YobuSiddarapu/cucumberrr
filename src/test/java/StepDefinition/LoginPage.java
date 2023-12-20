package StepDefinition;

import com.pages.Loginsteps;

import PageFactory.Driverfactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	public Loginsteps login=new Loginsteps(Driverfactory.getDriver());
	
	@Given("user given valid credentials")
	public void user_given_valid_credentials() {
		Driverfactory.getDriver().get("https://marolixhr.com/login");

	
	}

	@When("user given username\"yobu2252.marolix@gmail.com\"")
	public void user_given_username_yobu2252_marolix_gmail_com(String username) {
		login.EnterUsername(username);
		

	
	}

	@And("user given password\"{int}\"")
	public void user_given_password(String password) {
		login.Enterpassword(password);

	
	
	}

	@And("click the login button")
	public void click_the_login_button() {
		login.Clickbtn();

	
	}

	@Then("user into the home page")
	public void user_into_the_home_page() {
		
 
	
	}

}
