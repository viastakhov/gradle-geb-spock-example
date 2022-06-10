import geb.Constants
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver

/*
	This is the Geb configuration file.
	See: http://www.gebish.org/manual/current/configuration.html
*/

waiting {
    timeout = 2
}

if (Constants.BROWSER_TYPE == 'firefox') {
    driver = {
        FirefoxOptions firefoxOptions = new FirefoxOptions()
        firefoxOptions.setCapability('marionette', true)
        new RemoteWebDriver(new URL(Constants.SELENIUM_HUB_URL), DesiredCapabilities.firefox())
    }
} else if (Constants.BROWSER_TYPE == 'chrome') {
    driver = {
        ChromeOptions chromeOptions = new ChromeOptions()
        new RemoteWebDriver(new URL(Constants.SELENIUM_HUB_URL), chromeOptions)
    }
}

baseUrl = Constants.BASE_URL