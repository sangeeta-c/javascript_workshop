package automate_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automate_Firefox_browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\browserexes\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();// local variable
		driver.get("http://google.com");
		driver.quit();

	}

}
