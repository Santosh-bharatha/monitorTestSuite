package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	

	@SuppressWarnings("deprecation")
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\SANTOSH\\PROJECTS\\workspace\\monitor-test-suite\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		System.out.println("Inside Login page");
		String URL = "https://google.com";

		driver.get(URL);

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Enter username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("User clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("User is navigated to google page");
		System.out.println("Closing driver");
	}

}
