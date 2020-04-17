package br.com.tools;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import io.cucumber.java.Scenario;

public class Util {

    /**
     * @Description Return tag gherkin name
     */
    public static String getTagGherkin(Scenario newScenario) {
	String id = null;
	Collection<String> tags = newScenario.getSourceTagNames();
	for (String tag : tags) {
	    if (tag.substring(0, 3).equals("@ID")) {
		id = tag.substring(tag.indexOf("ID"));
		break;
	    }
	}
	return id;
    }

    /**
     * @Description Return file in json
     */
    public static JsonObject readFilejson(String name) throws FileNotFoundException, IOException, ParseException {

	String filePath = getPropperties("app.data.mass.path");
	JsonObject json = (JsonObject) new JsonParser().parse(new FileReader(filePath + "/" + name + ".json"));

	return json;
    }

    /**
     * @Description Return a true or false if element exist
     */
    public static boolean waitElementsExist(WebDriver driver, By by) {
	WebDriverWait wait = new WebDriverWait(driver, 10);
	boolean show = false;
	int time = 0;
	try {
	    show = false;

	    while (!show) {
		if (wait.until(ExpectedConditions.presenceOfElementLocated(by)).isDisplayed()) {
		    show = true;
		} else if (time == 10) {
		    break;
		} else {
		    Thread.sleep(1000);
		    time++;
		}
	    }

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
	return show;
    }

    /**
     * @Description Return a true or false if alert exist
     */
    public static boolean isDialogPresent(WebDriver driver) {
	boolean show = false;
	try {
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    if (wait.until(ExpectedConditions.alertIsPresent()) != null)
		show = true;

	} catch (Exception e) {
	}
	return show;

    }

    /**
     * @Description Return one properties in the file .properties
     */
    public static String getPropperties(String propertie) {
	Properties properties = new Properties();
	try {
	    Thread.currentThread().getContextClassLoader();
	    properties.load(ClassLoader.getSystemResource("properties/app.properties").openStream());
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return properties.getProperty(propertie);
    }
}