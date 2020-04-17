package br.com.automation.function;

import org.openqa.selenium.WebDriver;

import br.com.automation.views.MenuView;
import br.com.engine.Driver;
import br.com.tools.Util;

public class WebsiteFunction {

    private WebDriver driver = Driver.driver;

    private MenuView menu = null;

    public void navigateToPage() {
	String url = Util.getPropperties("app.browser.url");
	
	driver.navigate().to(url);
	driver.manage().window().maximize();
    }

    public void navigateToMenu() {
	menu = new MenuView(driver);
	
	menu.produtosServicos().click();
	menu.buscaCEP().click();
    }
}