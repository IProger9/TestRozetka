package foo.jbehave;

import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.jbehave.ThucydidesJUnitStories;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {
	public AcceptanceTestSuite() {
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

	    getSystemConfiguration().setIfUndefined("webdriver.driver", "chrome");
	    getSystemConfiguration().setIfUndefined(ThucydidesSystemProperty.THUCYDIDES_STORE_HTML_SOURCE.getPropertyName(), "true");
	    getSystemConfiguration().setIfUndefined(ThucydidesSystemProperty.THUCYDIDES_TAKE_SCREENSHOTS.getPropertyName(), "FOR_FAILURES");
	    }
	}

