package automate_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automate_chrome_browser 
{
	public static WebDriver driver;  // global variable
	
	public static void main(String[] args) 
	{
		try // if you are using Thread,sleep() then select portion within curly breses of main method and surround it with try/catch 
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\browserexes\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize(); // to maximize window
			driver.get("http://google.com");
			Thread.sleep(4000);
			
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
