package br.com.automation.function;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import br.com.automation.views.SearchCepView;
import br.com.engine.Driver;
import br.com.engine.Hooks;
import br.com.tools.Util;

public class SearchCepFunction {

    private SearchCepView view = null;

    private WebDriver driver = Driver.driver;

    private String cep = null;

    public void searchCep() {
	view = new SearchCepView(driver);

	boolean loadElementVisible = Util.waitElementsExist(driver, view.txtAddressOrCEP);

	if (!loadElementVisible)
	    throw new ElementNotVisibleException("Failed [Element is not visible in page search cep]");

	try {
	    cep = Util.readFilejson(Hooks.Scenario).get("CEP").getAsString();
	} catch (ParseException | IOException e) {
	    e.printStackTrace();
	}

	view.txtAddressOrCEP().click();
	view.txtAddressOrCEP().clear();
	view.txtAddressOrCEP().sendKeys(cep);

	view.btnBuscar().click();
    }

    public void resultFound() {
	if (Util.isDialogPresent(driver)) {
	    System.out.println("Scenario [" + Hooks.Scenario + "] Passed - Not possible search Cep null");
	} else {

	    if (view.lblResult().isDisplayed()) {
		System.out.println("Scenario [" + Hooks.Scenario
			+ "] Passed -The searche not locator datas for address input {" + cep + "}");
	    } else {

		WebElement table = driver.findElement(By.tagName("table"));

		if (table.getText().contains("74573-000")) {
		    System.out.println("Scenario [" + Hooks.Scenario
			    + "] Passed:[The searche locator datas for address input {" + cep + "}");
		} else {
		    throw new ElementNotVisibleException(
			    "Failed: [Not possible locator cep {" + cep + "} in the list result]");
		}
	    }
	}
    }
}
