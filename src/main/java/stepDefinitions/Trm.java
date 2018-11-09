package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Trm {

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

	@Given("el vigilante se encuentra la aprincipal del parqueadero")
	public void el_vigilante_se_encuentra_la_aprincipal_del_parqueadero() {
		controller.manage().window().maximize();
		controller.get("http://localhost:4200/");
	}

	@When("el vigilante de click en el tab TRM")
	public void el_vigilante_de_click_en_el_tab_TRM() throws InterruptedException {
		controller.findElement(By.id("mat-tab-label-0-2")).click();
		Thread.sleep(1000);
	}

	@Then("entonces el vigilante podra ver trm del dia actual")
	public void entonces_el_vigilante_podra_ver_trm_del_dia_actual() {

		String result = controller.findElement(By.name("trm-value")).getText();

		assertTrue(result.length() > 4 );

	}

}
