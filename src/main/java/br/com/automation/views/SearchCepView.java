package br.com.automation.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchCepView {

    private WebDriver driver;

    public By txtAddressOrCEP = By.name("relaxation");
    public By btnBuscar = By.xpath("//*[@value='Buscar']");
    public By lblResult = By.xpath("//*[contains(text(),'DADOS NAO ENCONTRADOS')]");
    
    public SearchCepView(WebDriver driver) {
	this.driver = driver;
    }

    public WebElement txtAddressOrCEP() {
	return driver.findElement(txtAddressOrCEP);
    }

    public WebElement btnBuscar() {
	return driver.findElement(btnBuscar);
    }
    
    public WebElement lblResult() {
	return driver.findElement(lblResult);
    }
}