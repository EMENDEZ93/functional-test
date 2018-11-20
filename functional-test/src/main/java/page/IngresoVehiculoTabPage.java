package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IngresoVehiculoTabPage {

	WebDriver controller;
	
	public IngresoVehiculoTabPage(WebDriver controller) {
		this.controller = controller;
	}
	
	public void inicioPage() {
		controller.get("http://localhost:4200/");
	}
	
	public void clickIngresoVehiculoTab() throws InterruptedException {
		controller.findElement(By.id("mat-tab-label-0-1")).click();
		Thread.sleep(1000);
	}
	
	public void clickMotoTab() throws InterruptedException {
		controller.findElement(By.id("mat-tab-label-1-0")).click();
		Thread.sleep(1000);
	}
	
	public void setPlacMotoaField(String placa) throws InterruptedException {
		controller.findElement(By.name("placa-moto")).sendKeys(placa);
		Thread.sleep(1000);
	}
	
	public void setCilingrajeField(String cilindraje) throws InterruptedException {
		controller.findElement(By.name("cilindraje")).sendKeys(cilindraje);
		Thread.sleep(1000);
	}
	
	public void clickIngresarMotoButton() throws InterruptedException {
		controller.findElement(By.id("ingresar-vehiculo-moto-submit")).click();
		Thread.sleep(1000);
	}

	public void clickCarroTab() throws InterruptedException {
		controller.findElement(By.id("mat-tab-label-1-1")).click();
		Thread.sleep(1000);
	}
	
	public void setPlacaCarroField(String placa) throws InterruptedException {
		controller.findElement(By.name("placa-carro")).sendKeys(placa);
		Thread.sleep(1000);
	}
	
	public void clickIngresarCarroButton() throws InterruptedException {
		controller.findElement(By.id("ingresar-vehiculo-carro-submit")).click();
		Thread.sleep(1000);
	}
	
	
}
