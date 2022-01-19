package TejaUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver type(String s) {

        if (s.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/tnutakki/OnBoarding/chromedriver 2");
            return new ChromeDriver();
        }
        System.setProperty("webdriver.gecko.driver", "/Users/tnutakki/OnBoarding/Testing Practice/geckodriver");
        return new FirefoxDriver();
    }

}
