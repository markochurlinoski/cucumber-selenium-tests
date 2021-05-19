package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AuthenticationPage;
import pages.RegistrationPage;

public class LoginSteps {
	
	WebDriver driver;
	RegistrationPage objRegistration;
	AuthenticationPage objAuthentication;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		objAuthentication = PageFactory.initElements(driver, pages.AuthenticationPage.class);
		driver.get("http://automationpractice.com/");
	}
	
	public void tearDown(){
    	driver.close();
    }
	
	@Given("I am on the customers login page")
	public void i_am_on_the_customers_login_page() {
		setUp();
		objAuthentication.clickSignIn1Button();	
	}

	@When("I provide valid login credentials")
	public void i_provide_valid_login_credentials() {
		objAuthentication.setEmailAddress2TextField("marko_w7gewt2u7q@localhost.local");
		objAuthentication.setPasswordPasswordField("testing123--");
	}

	@When("I Click on the login button")
	public void i_click_on_the_login_button() {
		objAuthentication.clickSignIn2Button();
	}

	@Then("I should be redirected to customer page")
	public void i_should_be_redirected_to_customer_page() {
		Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("My account - My Store");
		assertTrue(verifyTitleIsPresent);
		tearDown();
	}
}
