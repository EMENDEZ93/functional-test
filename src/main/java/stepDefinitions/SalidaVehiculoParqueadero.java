package stepDefinitions;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SalidaVehiculoParqueadero {

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
	
	@Given("el vigilante se encuentra en la pagina principal del parqueadero")
	public void el_vigilante_se_encuentra_en_la_pagina_principal_del_parqueadero() {
		controller.manage().window().maximize();
		controller.get("http://localhost:4200/");	
	}
	
	@When("el vigilante de click en el tab vehiculos parqueados")
	public void el_vigilante_de_click_en_el_tab_vehiculos_parqueados() throws InterruptedException {
		controller.findElement(By.id("mat-tab-label-0-0")).click();
		Thread.sleep(1000);
	}

	@When("el vigilante de click en el salida en el primer registro")
	public void el_vigilante_de_click_en_el_salida_en_el_primer_registro() throws InterruptedException {
		controller.findElement(By.id("888-ccc-salida-submit")).click();
		Thread.sleep(1000);
	}
	
	@Then("entonces el vigilante podra ver un mensaje \"(.*)\" salida con exito")
	public void entonces_el_vigilante_podra_ver_un_mensaje_salida_con_exito(String message) {	
		String result = controller.findElement(By.name("salida-successful-alert")).getText();

		assertEquals(message, result);

	}
	
}
