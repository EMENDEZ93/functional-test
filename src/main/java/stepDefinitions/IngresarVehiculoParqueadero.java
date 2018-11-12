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
import page.IngresoVehiculoTabPage;

public class IngresarVehiculoParqueadero {

	WebDriver controller;

	IngresoVehiculoTabPage ingresoVehiculoTabPage;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		controller = new ChromeDriver();
		
		ingresoVehiculoTabPage = new IngresoVehiculoTabPage(controller);
	}

	@After
	public void tearDown() {
		controller.close();
	}

	// ingresar vehiculo tipo moto

	@Given("el vigilante esta en la pagina principal del parqueadero")
	public void el_vigilante_esta_en_la_pagina_principal_del_parqueadero() {
		controller.manage().window().maximize();
		controller.get("http://localhost:4200/");
	}

	@When("el vigilante de click en el tab ingresar vehiculo")
	public void el_vigilante_de_click_en_el_tab_ingresar_vehiculo() throws InterruptedException {
		ingresoVehiculoTabPage.clickIngresoVehiculoTab();
	}

	@When("este en el tab moto")
	public void este_en_el_tab_moto() throws InterruptedException {
		ingresoVehiculoTabPage.clickMotoTab();
	}

	@When("^e ingrese la placa \"(.*)\"$")
	public void e_ingrese_la_placa(String placa) throws InterruptedException {
		ingresoVehiculoTabPage.setPlacMotoaField(placa);
	}

	@When("^e ingrese el cilindraje \"(.*)\"$")
	public void e_ingrese_el_cilindraje(String cilindraje) throws InterruptedException {
		ingresoVehiculoTabPage.setCilingrajeField(cilindraje);
	}

	@When("el vigilante de click en el boton ingresar")
	public void el_vigilante_de_click_en_el_boton_ingresar() throws InterruptedException {
		ingresoVehiculoTabPage.clickIngresarMotoButton();
	}

	@Then("entonces el vigilante podra ver un mensaje \"(.*)\" parqueado con exito$")
	public void entonces_el_vigilante_podra_ver_un_mensaje_parqueado_con_exito(String message) {

		String result = controller.findElement(By.name("ingreso-vehiculo-moto-successfull-alert")).getText();

		assertEquals(message, result);

	}

	// ingresar vehiculo tipo carro

	@Given("el vigilante se encuentra la pagina principal del parqueadero")
	public void el_vigilante_se_encuentra_la_pagina_principal_del_parqueadero() {
		controller.manage().window().maximize();
		controller.get("http://localhost:4200/");
	}

	@When("el vigilante se ubica en el tab ingresar vehiculo")
	public void el_vigilante_se_ubica_en_el_tab_ingresar_vehiculo() throws InterruptedException {
		ingresoVehiculoTabPage.clickIngresoVehiculoTab();
	}

	@When("este en el tab carro")
	public void este_en_el_tab_carro() throws InterruptedException {
		ingresoVehiculoTabPage.clickCarroTab();
	}

	@When("^e introduce la placa \"(.*)\"$")
	public void e_introduce_la_placa(String placa) throws InterruptedException {
		ingresoVehiculoTabPage.setPlacaCarroField(placa);
	}

	@When("de click en el boton ingresar")
	public void de_click_en_el_boton_ingresar() throws InterruptedException {
		ingresoVehiculoTabPage.clickIngresarCarroButton();
	}

	@Then("^entonces podra ver un mensaje \"(.*)\" parqueado con exito$")
	public void entonces_podra_ver_un_mensaje_parqueado_con_exito(String message) {
		
		String result = controller.findElement(By.name("ingreso-vehiculo-carro-successfull-alert")).getText();

		assertEquals(message, result);
	}

	
	//ingresar vehiculo tipo moto sin cilindraje
	
	@Given("el vigilante esta en la pagina inicio del parqueadero")
	public void el_vigilante_esta_en_la_pagina_inicio_del_parqueadero() {
		controller.get("http://localhost:4200/");
	}
	
	@When("el vigilante se dirija al tab ingresar vehiculo")
	public void el_vigilante_se_dirija_al_tab_ingresar_vehiculo() throws InterruptedException {
		ingresoVehiculoTabPage.clickIngresoVehiculoTab();
	}
	
	@When("este se dirija tab moto")
	public void este_se_dirija_tab_moto() throws InterruptedException {
		ingresoVehiculoTabPage.clickMotoTab();
	}

	@When("^digite la placa \"(.*)\"$")
	public void digite_la_placa(String placa) throws InterruptedException {
		ingresoVehiculoTabPage.setPlacMotoaField(placa);
	}
	
	@When("el vigilante presione en el boton ingresar")
	public void el_vigilante_presione_en_el_boton_ingresar() throws InterruptedException {
		ingresoVehiculoTabPage.clickIngresarMotoButton();
	}
	
	@Then("^entonces el vigilante podra ver un mensaje de error \"(.*)\"$")
	public void entonces_el_vigilante_podra_ver_un_mensaje_de_error(String message) {
		String result = controller.findElement(By.name("ingreso-vehiculo-moto-error-alert")).getText();

		assertEquals(message, result);
	}
}
