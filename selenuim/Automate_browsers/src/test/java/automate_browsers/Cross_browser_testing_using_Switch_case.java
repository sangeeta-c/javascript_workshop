package automate_browsers;

import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Cross_browser_testing_using_Switch_case 
{
	public static WebDriver driver; // global variable

	public static void main(String[] args)
	{
		try {
			String browser ="opera"; // it can be read browser name from test case sheet browser call
			String URL = "https://www.facebook.com/";
			
			switch (browser) 
				{
					case "firefox":
						System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\browserexes\\geckodriver.exe");
						driver = new FirefoxDriver();					
						break;
						
					case "ie":
						System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\browserexes\\IEDriverServer.exe");
						driver = new InternetExplorerDriver();

						
						break;
			
					case "chrome":
						System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\browserexes\\chromedriver.exe");
						driver = new ChromeDriver();
						break;
						
					default :
						System.out.println("Entered browser name is invalid");
						
						break;
						

				}
			
			driver.manage().window().maximize(); // to maximize window
			driver.get(URL);
			Thread.sleep(4000);
			driver.quit();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
