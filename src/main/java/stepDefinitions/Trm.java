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

	@Given("el vigilante se ubica la pagina principal del parqueadero")
	public void el_vigilante_se_ubica_la_pagina_principal_del_parqueadero() {
		controller.manage().window().maximize();
		controller.get("http://localhost:4200/");
	}

	@Then("entonces el vigilante podra ver trm del dia actual en la parte superior de la pagina")
	public void entonces_el_vigilante_podra_ver_trm_del_dia_actual_en_la_parte_superior_de_la_pagina() {
		String result = controller.findElement(By.name("trm-value")).getText();

		assertTrue(result.length() > 10);
	}

}
