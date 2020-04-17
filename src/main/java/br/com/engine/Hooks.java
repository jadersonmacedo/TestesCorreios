package br.com.engine;

import br.com.tools.Util;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Driver {

    public static String Scenario = null;

    @Before
    public void beforeTest(Scenario newScenario) {
	if (driver == null)
	    getDriver();

	if (Scenario == null)
	    Scenario = Util.getTagGherkin(newScenario);
	else if (!Scenario.equals(Util.getTagGherkin(newScenario))) {
	    Scenario = Util.getTagGherkin(newScenario);
	}
    }

}