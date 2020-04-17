package br.com.automation.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuView {

    private WebDriver driver;

    public MenuView(WebDriver driver) {
	this.driver = driver;
    }

    public WebElement produtosServicos() {
	return driver.findElement(By.xpath("//*[@id='products_services']"));
    }

    public WebElement buscaCEP() {
	return driver.findElement(By.xpath("//*[contains(text(),'Busca CEP')]"));
    }
}