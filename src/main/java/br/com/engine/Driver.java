package br.com.engine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.tools.Util;

public class Driver {

    public static WebDriver driver = null;

    @SuppressWarnings("deprecation")
    public WebDriver getDriver() {
	DesiredCapabilities capabilities = null;
	try {
	    capabilities = DesiredCapabilities.chrome();

	    capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

	    System.setProperty("webdriver.chrome.driver", Util.getPropperties("app.driver.path"));
	    driver = new ChromeDriver(capabilities);
	    driver.wait(3000);
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
	return driver;
    }

    public void killDriver() {
	driver.quit();
    }
}
