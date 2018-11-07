package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IngresarVehiculoParqueadero {

	WebDriver controller;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		controller = new ChromeDriver();
	}

	@After
	public void tearDown() {
		controller.close();
	}

	@Given("dado")
	public void dado() {
	}

	@When("cuando")
	public void cuando() {

	}

	@Then("entonces")
	public void entonces() {
	}

}
