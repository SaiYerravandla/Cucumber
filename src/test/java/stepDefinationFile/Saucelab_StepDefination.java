package stepDefinationFile;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import swagLab_POMS.Swag_lab_ADD_To_CART_POM;

public class Saucelab_StepDefination {
	
	
	WebDriver driver;
	Swag_lab_ADD_To_CART_POM slp=new Swag_lab_ADD_To_CART_POM(driver);
	
	@Given("^Launch_Browser$")
	public void launch_browser() throws InterruptedException {
		
		slp.Launch_Browser();
	  
	}

//	@When("^Enter_Valid_Login_Credentials$")
//	public void enter_valid_login_credentials() throws InterruptedException 
	@When("Enter_Valid_Login_Credentials {string}and {string}")
	public void enter_valid_login_credentials_standard_user_and(String user,String pass) throws InterruptedException{
	    slp.Enter_Valid_Login_Credentials(user, pass);
	}

	@Then("^Checking_Homepage$")
	public void checking_homepage() throws InterruptedException {
	 slp.Checking_Homepage();  
	}

	@Then("^Add_to_Cart$")
	public void add_to_cart() throws InterruptedException {
		slp.Add_to_Cart();
	   
	}

	@Then("^Logout$")
	public void logout() {
		
		slp.Logout();
	    	}

}
