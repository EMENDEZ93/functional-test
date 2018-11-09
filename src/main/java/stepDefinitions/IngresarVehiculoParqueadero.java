package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
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

	@Given("el vigilante esta en la pagina principal del parqueadero")
	public void el_vigilante_esta_en_la_pagina_principal_del_parqueadero() {
		controller.manage().window().maximize();
		controller.get("http://localhost:4200/");
	}
	
	@When("el vigilante de click en el tab ingresar vehiculo")
	public void el_vigilante_de_click_en_el_tab_ingresar_vehiculo() throws InterruptedException {
		controller.findElement(By.id("mat-tab-label-0-1")).click();
		Thread.sleep(1000);
	}
	
	@When("este en el tab moto")
	public void este_en_el_tab_moto() throws InterruptedException {
		controller.findElement(By.id("mat-tab-label-1-0")).click();
		Thread.sleep(1000);
	}
	
	@When("^e ingrese la placa \"(.*)\"$")
	public void e_ingrese_la_placa(String placa) throws InterruptedException {
		controller.findElement(By.name("placa-moto")).sendKeys(placa);
		Thread.sleep(1000);
	}
	
	@When("^e ingrese el cilindraje \"(.*)\"$")
	public void e_ingrese_el_cilindraje(String cilindraje) throws InterruptedException {
		controller.findElement(By.name("cilindraje")).sendKeys(cilindraje);
		Thread.sleep(1000);
	}
	
	@When("el vigilante de click en el boton ingresar")
	public void el_vigilante_de_click_en_el_boton_ingresar() throws InterruptedException {
		controller.findElement(By.id("ingresar-vehiculo-moto-submit")).click();
		Thread.sleep(1000);
	}
	
	@Then("entonces el vigilante podra ver un mensaje \"(.*)\" parqueado con exito$")
	public void entonces_el_vigilante_podra_ver_un_mensaje_parqueado_con_exito(String message) {
	
		String result = controller.findElement(By.name("ingreso-vehiculo-moto-successfull-alert")).getText();
	
		assertEquals(message, result);
		
	}
}
